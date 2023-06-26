package T2

import java.io.Closeable
import java.io.FileOutputStream
import java.io.OutputStream

class OutFile(path: String) : Closeable {
    private var out : OutputStream? = FileOutputStream(path)
    fun write(msg: String) = out?.write(msg.toByteArray())
    override fun close() = cleanup("closed")
    protected fun finalize() = cleanup("finalized")
    private fun cleanup(str: String) { write(str); out!!.close(); out = null }
}

fun main() {
    val invalidPath = "invalid/path.txt"

    val outFile = OutFile(invalidPath)

    try {
        outFile.write("Test message")
    } finally {
        outFile.close()
    }
}