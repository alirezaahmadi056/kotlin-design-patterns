
class NameRepository : Container {

    val names = arrayOf("name1", "name2", "name3")

    override fun getIterator(): Iterator = NameIterator()

    private inner class NameIterator : Iterator {

        var index = 0

        override fun hasNext(): Boolean = index < names.size

        override fun next(): Any = if (hasNext()) names[index++] else Unit

    }

}