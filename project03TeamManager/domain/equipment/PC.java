package domain.equipment;

import domain.equipment.Equipment;

/**
 * 台式电脑类{@code PC}是应用了设备接口{@code Equipment}的类。
 *
 * <p>台式电脑主要作为程序员类{@code Programmer}及其子类领用的电子设备。
 *
 * @author MarkChern
 */
public class PC implements Equipment
{
    /**型号*/
    private String model;
    /**显示屏*/
    private String display;

    /**
     * 构造一个指定型号和显示屏的台式电脑对象。
     * @param model
     *      型号
     * @param display
     *      显示屏
     */
    public PC(String model, String display)
    {
        this.model = model;
        this.display = display;
    }

    /**
     * 返回该对象的型号和显示屏的字符串描述。
     * @return 型号和显示屏的字符串描述。
     */
    @Override
    public String getDescription()
    {
        return "PC{" +
                "model='" + model + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
