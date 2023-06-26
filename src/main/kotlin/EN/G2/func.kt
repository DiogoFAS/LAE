package EN.G2

import java.io.Closeable
import java.io.FileOutputStream

open class FinishFile(path: String) : Closeable {
    private val out = FileOutputStream(path)

    fun write(msg: String) =
        out.write(msg.toByteArray())

    fun close(msg: String) {
        write(msg)
        out.close()
    }

    override fun close() = close("CLOSED")
    protected fun finalize() = close("FINALIZED")
    // Pode ser acedido por classes dessa classe, para métodos privados
}

val titles =
    arrayOf("start", "begin", "init")

fun main() {
    try{
        func1()
    } finally {
        System.gc()
        System.runFinalization()
    }
}

fun func1() {
    val ff = FinishFile("out.txt")
    ff.write(titles[7])
    ff.close()

}

fun func2() {
    FinishFile("out.txt").use {
        it.write(titles[5])
    }
}

fun func3() {
    FinishFile("out.txt")
        .write(titles[2])
}
