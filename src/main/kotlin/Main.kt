fun main(cpf: String):Boolean {
    val clenedCpf = cpf.replace("\\D".toRegex(),"")

    if (clenedCpf.length !=11){
        return false
    }
return true
}