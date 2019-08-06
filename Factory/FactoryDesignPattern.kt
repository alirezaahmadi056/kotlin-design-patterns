
class Man : Human {

    override fun talking() {

        //Log.i("Test", "TestMan")

    }
}

class WoMan : Human {

    override fun talking() {

        //Log.i("Test", "TestWoMan")

    }

}

class Factory {

    companion object {

        const val man = 0
        const val woMan = 1

    }

    fun factory(type: Int): Human? =
        when (type) {
            man -> Man()
            woMan -> WoMan()
            else -> null
        }

}

interface Human {

    fun talking()

}