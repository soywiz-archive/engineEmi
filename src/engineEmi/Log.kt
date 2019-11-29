package engineEmi

import com.soywiz.klogger.*

object Log {
    val logger = Logger("engineEmig")
    fun log(s : String){
        logger.log(Logger.Level.INFO) { s }
    }
}