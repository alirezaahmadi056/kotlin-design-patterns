
import android.util.Log

class IteratorPatternDemo {

    init {

        val test = NameRepository().getIterator()

        while (test.hasNext()) {

            Log.i("TEST", "${test.next()} ")

        }

    }

}