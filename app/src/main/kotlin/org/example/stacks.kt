class Stack(size: Int) {

    val arr = Array<Int>(size) {0}
    var top: Int = -1

    fun push(value: Int) {
        if (top == arr.size - 1) {
            print("stack overflow\n")
        } else {
            top ++
            arr[top] = value
            print("pushed element successfully\n")
        }
    }

    fun pop() {
        if (top == -1) {
            print("stack underflow\n")
        } else {
            top--
            arr[top] = 0
            print("deleted successfully\n")
        }
    }

    fun isEmpty(): Boolean {
        return if (top == -1) {
            true
        } else {
            false
        }
    }

    fun isFull(): Boolean {
        if (top ==  arr.size - 1) {
            return true
        } else {
            return false
        }
    }

}