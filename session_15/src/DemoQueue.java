import java.util.*;

public class DemoQueue {
    public static void main(String[] args) {
        // Queue
        // -> PriorityQueue
        Queue<String> girlFriend = new PriorityQueue<>();
        /**
         * 1. thêm
         *      - add - không an toàn
         *      - offer - an toàn
         * 2. xoá
         *      - remove
         *      - poll
         * 3. xem
         *      - element
         *      - peek
         * */
//        girlFriend.offer("Trần Duy K");
//        girlFriend.offer("Nguyễn Duy Q");
//        girlFriend.offer("Trịnh Trần Phương J");
//        System.out.println(girlFriend);
//        System.out.println(girlFriend.peek());
//        System.out.println(girlFriend.poll());

        Comparator<BadStudent> badStudentComparator = new Comparator<BadStudent>() {
            @Override
            public int compare(BadStudent o1, BadStudent o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Queue<BadStudent> badStudents = new PriorityQueue<>(badStudentComparator);
        badStudents.offer(new BadStudent("Lê Thành L", 9));
        badStudents.offer(new BadStudent("Nguyễn Tiến Dũng", 7));
        badStudents.offer(new BadStudent("Nguyễn Hoàng Nhật", 5));
        badStudents.offer(new BadStudent("Ngô Quang Anh", 10));
        badStudents.offer(new BadStudent("Vi Trung Quý", 1));
        for (BadStudent s : badStudents) {
            System.out.println(s);
        }
        // Deque
        // -> ArrayDeque
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst(); // thêm đầu
        deque.addLast(); // thêm cuối
        deque.offerFirst(); // thêm đầu
        deque.offerLast(); // thêm cuối
        deque.removeFirst(); // xoá đầu
        deque.removeLast(); // xoá cuối
        deque.pollFirst(); // xoá đầu
        deque.pollLast();  // xoá cuối
    }
}
