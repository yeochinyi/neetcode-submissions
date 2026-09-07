
class DynamicArray(capacity: Int) {
    var a = IntArray(capacity)
    var s = 0

    fun get(i: Int): Int {
        return a[i]
    }

    fun set(i: Int, n: Int) {
        a[i] = n
    }

    fun pushback(n: Int) {
        if(s == a.size){
            resize()
        }
        a[s] = n
        s++
    }

    fun popback(): Int {
        s--
        return a[s]
    }

    private fun resize() {
        val b = IntArray(a.size*2)
        a.copyInto(b)
        a = b
    }

    fun getSize(): Int {
        return s
    }

    fun getCapacity(): Int {
        return a.size
    }
}
