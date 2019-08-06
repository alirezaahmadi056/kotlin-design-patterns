
import android.util.Log

class Observer(override var observable: Observable) : Observers() {

    init {

        observable.attach(this)

    }

    override fun update() {

        Log.i("TEST_UPDATE", "update: ${observable.state}")

    }

}