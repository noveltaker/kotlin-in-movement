package org.example.main.solid.DependencyInversionPrinciple.bad

class FEDeveloper {

    fun writerHtmlCode() {
    }
}

class BEDeveloper {
    fun writerKotlinCode() {
    }
}

class SoftwareProject constructor(private var feDeveloper: FEDeveloper, var beDeveloper: BEDeveloper) {

    fun createProject() {
        this.feDeveloper.writerHtmlCode()
        this.beDeveloper.writerKotlinCode()
    }
}
