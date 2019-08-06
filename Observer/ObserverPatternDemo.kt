
import android.util.Log

class ObserverPatternDemo {

    init {

        val observable = Observable()
        Observer(observable)

        observable.state = 15
        Log.i("TEST_UPDATE", "15")
        observable.state = 10
        Log.i("TEST_UPDATE", "10")

    }

}