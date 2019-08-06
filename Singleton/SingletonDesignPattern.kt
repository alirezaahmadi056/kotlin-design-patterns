
class SingletonDesignPattern {

    companion object {

        private var singletonDesignPattern: SingletonDesignPattern? = null

        val instance: SingletonDesignPattern
            get() {
                if (singletonDesignPattern == null) singletonDesignPattern = SingletonDesignPattern()
                return singletonDesignPattern!!
            }

    }

}