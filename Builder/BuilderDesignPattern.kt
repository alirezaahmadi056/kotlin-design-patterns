class BuilderDesignPattern private constructor(private val name: String, private val family: String) {

    companion object {

        class Builder {

            private var subName = "name default"
            private var subFamily = "family default"

            fun name(name: String): Builder {

                subName = name
                return Builder()

            }

            fun family(family: String): Builder {

                subFamily = family
                return Builder()

            }

            fun build():BuilderDesignPattern = BuilderDesignPattern(subName,subFamily)

        }

    }

}