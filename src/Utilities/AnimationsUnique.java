package Utilities;

import javax.swing.*;

public class AnimationsUnique {

    int button_Movement_Amount = 4;
    int button_Movement_Delay = 8;

    public void animButtonUp(final JPanel button, int Y) {
        Animations ac = new Animations();
        ac.jPanelYUp(Y, Y - button_Movement_Amount, button_Movement_Delay, 1, button);
    }

    public void animButtonDown(final JPanel button, int Y) {
        Animations ac = new Animations();
        ac.jPanelYDown(Y - button_Movement_Amount, Y, button_Movement_Delay, 1, button);
    }
    
    public void quickAnimButtonUp(final JPanel button, int Y) {
        Animations ac = new Animations();
        ac.jPanelYUp(Y, Y - button_Movement_Amount, button_Movement_Delay / 2, 1, button);
    }

    public void quickAnimButtonDown(final JPanel button, int Y) {
        Animations ac = new Animations();
        ac.jPanelYDown(Y - button_Movement_Amount, Y, button_Movement_Delay / 2, 1, button);
    }

    int label_Movement_Amount = 4;
    int label_Movement_Delay = 8;

    public void animLabelUp(final JLabel label, int Y) {
        Animations ac = new Animations();
        ac.jLabelYUp(Y, Y - label_Movement_Amount, label_Movement_Delay, 1, label);
    }

    public void animLabelDown(final JLabel label, int Y) {
        Animations ac = new Animations();
        ac.jLabelYDown(Y - label_Movement_Amount, Y, label_Movement_Delay, 1, label);
    }

    public void quickAnimLabelUp(final JLabel label, int Y) {
        Animations ac = new Animations();
        ac.jLabelYUp(Y, Y - label_Movement_Amount, label_Movement_Delay / 2, 1, label);
    }

    public void quickAnimLabelDown(final JLabel label, int Y) {
        Animations ac = new Animations();
        ac.jLabelYDown(Y - label_Movement_Amount, Y, label_Movement_Delay / 2, 1, label);
    }

}
