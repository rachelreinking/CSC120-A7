Use this file to record your reflection on this assignment.

- Which methods did you decide to `overload`, and why?
- What worked, what didn't, what advice would you give someone taking this course in the future?

Overloaded methods:

HOUSE 
- constructor from House (hard-coded address as "Smith College" because there are many situations where we don't need to know the specific address of a Smith house, only that it is on Smith campus)
- moveIn (took in int roomNum parameter and returned int roomNum because it is important for the students who are moving in to know which room they will be moving into)

LIBRARY
- addTitle (took in boolean availability parameter because in some cases we might want to have the ability to specify whether a book is available upon adding it to the collection. For example, a book might have a waiting list before it is ordered and therefore won't be available when it is added to the collection)
- printCollection (took in boolean includeAvail parameter because in some cases we might only want to know the titles and not their availability. For example, a library might want to only know what titles are in their collection and not their availability when ordering new books)

CAFE
- constructor from Cafe (hard-coded number of floors as 1 because cafes often are only 1 floor)
- sellCoffee (took in boolean receipt parameter, which asks if a customer wants a receipt and then prints it out if needed, because purchases often include the option for a receipt on the customer end)

At first I was confused as to how to overload a method, because I was under the impression that changing the output type or changing the code within the method counted as overloading. However, I realized through experimentation and going over the notes for this class that we had to change the input type or number of input in order to actually overload the method, which makes sense because it would not be possible to distinguish between which overloaded method was intended otherwise. I also ran into trouble specifically in the Library class, because I thought about overloading some of the methods so that it took in a int callNumber parameter instead of String title because that is closer to how actual library databases function, but I soon realized that due to Java's rigidity in the types of objects, this approach would have essentially required me to overload every method in that class, which I thought was outside the scope and expectations of this assignment. This was a good reminder about the specifications of Java and the importance of consistency in types of objects. I really enjoyed thinking creatively about different ways to implement the methods that already existed. I would recommend to future students to really take advantage of code they have already written, as things like super.method() and this.method() are really useful in saving space, time, and number of lines of code they have to write