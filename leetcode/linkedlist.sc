import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

class MyLinkedList() {
  var head: Node = _

  /** Initialize your data structure here. */
  case class Node(var `val`: Int, var next: Node = null)

  /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
  def get(index: Int): Int = {
    @scala.annotation.tailrec
    def loop(i: Int, node: Node): Int = {
      if (node == null) -1
      else if (i == index) node.`val`
      else loop(i + 1, node.next)
    }

    loop(0, head)
  }

  /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
  def addAtHead(`val`: Int): Unit = {
    val node = Node(`val`, head)
    head = node
  }

  /** Append a node of value val to the last element of the linked list. */
  def addAtTail(`val`: Int): Unit = {
    val node = Node(`val`)

    @scala.annotation.tailrec
    def loop(curr: Node): Unit = {
      if (curr.next == null) curr.next = node
      else loop(curr.next)
    }

    if (head == null) addAtHead(`val`) else loop(head)
  }

  /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
  def addAtIndex(index: Int, `val`: Int): Unit = {
    val node = Node(`val`)

    @scala.annotation.tailrec
    def loop(i: Int, curr: Node): Unit = {
      if (i + 1 == index) {
        val next = curr.next
        curr.next = node
        node.next = next
      }
      else if (i < index && curr.next != null) loop(i + 1, curr.next)
    }

    if (head == null || index == 0) addAtHead(`val`)
    else loop(0, head)
}

/** Delete the index-th node in the linked list, if the index is valid. */
def deleteAtIndex(index: Int): Unit = {
  @scala.annotation.tailrec
  def loop(i: Int, curr: Node): Unit = {
    if (i + 1 == index) {
      val next = curr.next
      curr.next = next.next
    }
    else if (i < index && curr.next != null) loop(i + 1, curr.next)
  }

  if (head == null) 
  if (head != null) {
    if (index == 0) head = head.next
    else loop(0, head)
  }
}

def printVals(): Unit = {
  val arr: mutable.ArrayBuffer[Int] = new ArrayBuffer[Int]
  var curr: Node = head
  while (curr != null) {
    arr += curr.`val`
    curr = curr.next
  }
  arr.foreach(println)
}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = new MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(`val`)
 * obj.addAtTail(`val`)
 * obj.addAtIndex(index,`val`)
 * obj.deleteAtIndex(index)
 */

// test
val myLinkedList = new MyLinkedList()
myLinkedList.addAtHead(2)
myLinkedList.deleteAtIndex(1)
//myLinkedList.addAtHead(2)

//myLinkedList.addAtTail(3)
//myLinkedList.addAtIndex(0, 2)
//myLinkedList.addAtIndex(0, 20)
//myLinkedList.addAtIndex(1, 30)
//myLinkedList.deleteAtIndex(4)
myLinkedList.get(0)
myLinkedList.printVals()