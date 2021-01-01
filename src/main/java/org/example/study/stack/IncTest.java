package org.example.study.stack;

/**
 * @Author qiu
 * @Date 2020/12/22 19:23
 *
 * i在经过++之后重新赋值给i，但是打印i为什么还是8？
 * 首先下面代码的实际执行指令：main()已经生成栈帧（Frame）
 *  0 bipush 8  将int 8压栈 -> 首先将byte 8扩展为int类型，然后放入操作数栈(operand stack)
 *  2 istore_1  将8赋值给i -> 首先将栈顶的value 8弹栈，然后赋值给本地变量表索引为1的i
 *  上述两步完成了int i = 8的操作
 *
 *  3 iload_1 重新将int 8压栈 -> 从本地变量表索引1的地方读取数据，并放入操作数栈中
 *  4 iinc 1 by 1 i++ -> 对本地变量表索引1的地方i进行加1操作
 *  7 istore_1 将8赋值给i -> 首先将栈顶的value 8弹栈，然后赋值给本地变量表索引为1的i
 *  上述三步完成了i = i++的操作
 *
 *  通过分析，我们发现由于i++操作是对本地变量i进行的，此时本地变量i的值已经是9了，但是操作数栈中的值还是8
 *  然后执行istore_1操作，等于将8覆盖了i的值
 *
 *  而++i则是先对本地变量i进行+1操作，然后再从本地变量表索引为1的地方读取数据到操作数栈，然后在写回到操作数栈
 *  所以打印i为9
 *
 *  8 getstatic #2 <java/lang/System.out>
 * 11 iload_1
 * 12 invokevirtual #3 <java/io/PrintStream.println>
 * 15 return
 */
public class IncTest {

    public static void main(String[] args) {
        int i = 8;
        // 执行i++，打印的是8
        i = i++;
        // 执行++i，打印的是9
        // i = ++i;
        System.out.println(i);
    }
}
