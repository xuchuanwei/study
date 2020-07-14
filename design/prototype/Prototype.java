package prototype;

/**
 * @Author xuchuanwei
 * @Mail 1141811203@qq.com
 * @Time 2020/7/14 14:54
 * 设计模式-原型模式
 **/
public class Prototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType obj1 = new RealizeType();
        RealizeType obj2 = (RealizeType) obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));
    }

}

class RealizeType implements Cloneable {
    RealizeType() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return super.clone();
    }
}
