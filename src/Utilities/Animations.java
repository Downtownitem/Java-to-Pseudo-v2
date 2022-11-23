package Utilities;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;

public class Animations {

    public Animations() {
    }

    public void jLabelYUp(final int start, final int stop, final int delay, final int increment, final JLabel jLabel) {
        if (jLabel.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jLabel.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jLabel.setLocation(jLabel.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jLabel.setLocation(jLabel.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    public void jLabelYDown(final int start, final int stop, final int delay, final int increment, final JLabel jLabel) {
        if (jLabel.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jLabel.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jLabel.setLocation(jLabel.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jLabel.setLocation(jLabel.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    public void jLabelXLeft(final int start, final int stop, final int delay, final int increment, final JLabel jLabel) {
        if (jLabel.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jLabel.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jLabel.setLocation(i, jLabel.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jLabel.setLocation(stop, jLabel.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    public void jLabelXRight(final int start, final int stop, final int delay, final int increment, final JLabel jLabel) {
        if (jLabel.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jLabel.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jLabel.setLocation(i, jLabel.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jLabel.setLocation(stop, jLabel.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    public void jTextFieldYUp(final int start, final int stop, final int delay, final int increment, final JTextField jTextField) {
        if (jTextField.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jTextField.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jTextField.setLocation(jTextField.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jTextField.setLocation(jTextField.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    public void jTextFieldYDown(final int start, final int stop, final int delay, final int increment, final JTextField jTextField) {
        if (jTextField.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jTextField.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jTextField.setLocation(jTextField.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jTextField.setLocation(jTextField.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    public void jTextFieldXLeft(final int start, final int stop, final int delay, final int increment, final JTextField jTextField) {
        if (jTextField.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jTextField.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jTextField.setLocation(i, jTextField.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jTextField.setLocation(stop, jTextField.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    public void jTextFieldXRight(final int start, final int stop, final int delay, final int increment, final JTextField jTextField) {
        if (jTextField.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jTextField.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jTextField.setLocation(i, jTextField.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jTextField.setLocation(stop, jTextField.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    public void jButtonYUp(final int start, final int stop, final int delay, final int increment, final JButton jButton) {
        if (jButton.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jButton.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jButton.setLocation(jButton.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jButton.setLocation(jButton.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    public void jButtonYDown(final int start, final int stop, final int delay, final int increment, final JButton jButton) {
        if (jButton.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jButton.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jButton.setLocation(jButton.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jButton.setLocation(jButton.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    public void jButtonXLeft(final int start, final int stop, final int delay, final int increment, final JButton jButton) {
        if (jButton.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jButton.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jButton.setLocation(i, jButton.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jButton.setLocation(stop, jButton.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    public void jButtonXRight(final int start, final int stop, final int delay, final int increment, final JButton jButton) {
        if (jButton.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jButton.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jButton.setLocation(i, jButton.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jButton.setLocation(stop, jButton.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    public void jPasswordFieldYUp(final int start, final int stop, final int delay, final int increment, final JPasswordField jPasswordField) {
        if (jPasswordField.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPasswordField.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPasswordField.setLocation(jPasswordField.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jPasswordField.setLocation(jPasswordField.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    public void jPasswordFieldYDown(final int start, final int stop, final int delay, final int increment, final JPasswordField jPasswordField) {
        if (jPasswordField.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPasswordField.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPasswordField.setLocation(jPasswordField.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jPasswordField.setLocation(jPasswordField.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    public void jPasswordFieldXLeft(final int start, final int stop, final int delay, final int increment, final JPasswordField jPasswordField) {
        if (jPasswordField.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPasswordField.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPasswordField.setLocation(i, jPasswordField.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jPasswordField.setLocation(stop, jPasswordField.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    public void jPasswordFieldXRight(final int start, final int stop, final int delay, final int increment, final JPasswordField jPasswordField) {
        if (jPasswordField.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPasswordField.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPasswordField.setLocation(i, jPasswordField.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jPasswordField.setLocation(stop, jPasswordField.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    public void jTextAreaYUp(final int start, final int stop, final int delay, final int increment, final JScrollPane jScrollPane) {
        if (jScrollPane.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jScrollPane.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jScrollPane.setLocation(jScrollPane.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jScrollPane.setLocation(jScrollPane.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    public void jTextAreaYDown(final int start, final int stop, final int delay, final int increment, final JScrollPane jScrollPane) {
        if (jScrollPane.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jScrollPane.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jScrollPane.setLocation(jScrollPane.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jScrollPane.setLocation(jScrollPane.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    public void jTextAreaXLeft(final int start, final int stop, final int delay, final int increment, final JScrollPane jScrollPane) {
        if (jScrollPane.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jScrollPane.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jScrollPane.setLocation(i, jScrollPane.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jScrollPane.setLocation(stop, jScrollPane.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    public void jTextAreaXRight(final int start, final int stop, final int delay, final int increment, final JScrollPane jScrollPane) {
        if (jScrollPane.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jScrollPane.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jScrollPane.setLocation(i, jScrollPane.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jScrollPane.setLocation(stop, jScrollPane.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    public void jPanelXLeft(final int start, final int stop, final int delay, final int increment, final JPanel jPanel) {
        if (jPanel.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPanel.getX() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPanel.setLocation(i, jPanel.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jPanel.setLocation(stop, jPanel.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    public void jPanelXRight(final int start, final int stop, final int delay, final int increment, final JPanel jPanel) {
        if (jPanel.getX() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPanel.getX() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPanel.setLocation(i, jPanel.getY());
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jPanel.setLocation(stop, jPanel.getY());
                        return;
                    }
                }
            }).start();
        }

    }

    public void jPanelYUp(final int start, final int stop, final int delay, final int increment, final JPanel jPanel) {
        if (jPanel.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPanel.getY() > stop) {
                            int i = start;

                            while (true) {
                                if (i < stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPanel.setLocation(jPanel.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i -= increment;
                            }
                        }

                        jPanel.setLocation(jPanel.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }

    public void jPanelYDown(final int start, final int stop, final int delay, final int increment, final JPanel jPanel) {
        if (jPanel.getY() == start) {
            (new Thread() {
                public void run() {
                    label23:
                    while (true) {
                        if (jPanel.getY() <= start) {
                            int i = start;

                            while (true) {
                                if (i > stop) {
                                    continue label23;
                                }

                                try {
                                    Thread.sleep((long) delay);
                                    jPanel.setLocation(jPanel.getX(), i);
                                } catch (InterruptedException var3) {
                                    System.out.println("Error Thread Interrupted: " + var3);
                                }

                                i += increment;
                            }
                        }

                        jPanel.setLocation(jPanel.getX(), stop);
                        return;
                    }
                }
            }).start();
        }

    }
}
