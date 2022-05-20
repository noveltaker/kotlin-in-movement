package solid.DependencyInversionPrinciple.good

interface Developer {
    fun develop()
}

class FEDeveloper : Developer {

    private fun writerHtmlCode() {

    }

    override fun develop() {
        this.writerHtmlCode()
    }
}

class BEDeveloper : Developer {

    private fun writerKotlinCode() {

    }

    override fun develop() {
        this.writerKotlinCode()
    }
}

class SoftwareProject constructor(private var developers: Array<Developer>) {

    fun createProject() {
        this.developers.forEach { it -> it.develop() }
    }
}
