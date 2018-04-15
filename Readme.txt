This is a simple implementation of a Queue data structure with the underlying data structure being a Linked List. This implementation follows
a First In First Out structure in that the first node that is enqueued in the stack is the first node to be dequeued and Queue's firstNode 
attribute is updated accordingly. When a node is enqueued the Queue's lastNode attribute is updated accordingly by pointing the lastNode from
null to the newly enqueued node and pointing that newly enqueued node to null.