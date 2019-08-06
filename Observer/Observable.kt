
class Observable {

    private val observersList = ArrayList<Observers>()

    /**
     * This is a custom field
     * You can change and customize this field
     */
    var state: Int = 0
        set(value) {

            field = value
            notifyAllObservers()

        }

    fun attach(observers: Observers) {

        observersList.add(observers)

    }

    private fun notifyAllObservers() { observersList.forEach { it.update() } }

}