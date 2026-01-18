import javax.swing.*;

class Fan {

    protected String status;
    protected int speed;

    Fan() {
        status = "OFF";
        speed = 0;
    }

    void controlFan(int temperature) {
    }

    String getStatus() {
        return status;
    }

    int getSpeed() {
        return speed;
    }
}

class SmartFan extends Fan {

    @Override
    void controlFan(int temperature) {

        if (temperature < 20) {
            status = "OFF";
            speed = 0;
        }
        else if (temperature <= 25) {
            status = "LOW";
            speed = 1;
        }
        else if (temperature <= 30) {
            status = "MEDIUM";
            speed = 2;
        }
        else {
            status = "HIGH";
            speed = 3;
        }
    }
}

public class SmartFanApp extends JFrame {

    Fan fan;

    JLabel temperatureLabel;
    JLabel statusLabel;
    JLabel speedLabel;

    JSlider temperatureSlider;
    JButton controlButton;

    SmartFanApp() {

        fan = new SmartFan();

        setTitle("Smart Fan Speed Controller");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        temperatureLabel = new JLabel("Set Temperature: 20°C");
        temperatureLabel.setBounds(20, 20, 200, 30);
        add(temperatureLabel);

        temperatureSlider = new JSlider(0, 40, 20);
        temperatureSlider.setBounds(20, 60, 350, 50);
        temperatureSlider.setMajorTickSpacing(10);
        temperatureSlider.setMinorTickSpacing(1);
        temperatureSlider.setPaintTicks(true);
        temperatureSlider.setPaintLabels(true);

        temperatureSlider.addChangeListener(e ->
            temperatureLabel.setText("Set Temperature: " + temperatureSlider.getValue() + "°C")
        );

        add(temperatureSlider);

        controlButton = new JButton("Control Fan");
        controlButton.setBounds(120, 130, 150, 40);

        controlButton.addActionListener(e -> {
            fan.controlFan(temperatureSlider.getValue());
            updateStatus();
        });

        add(controlButton);

        statusLabel = new JLabel("Status: OFF");
        statusLabel.setBounds(20, 180, 200, 30);
        add(statusLabel);

        speedLabel = new JLabel("Speed Level: 0");
        speedLabel.setBounds(20, 220, 200, 30);
        add(speedLabel);

        setVisible(true);
    }

    void updateStatus() {
        statusLabel.setText("Status: " + fan.getStatus());
        speedLabel.setText("Speed Level: " + fan.getSpeed());
    }

    public static void main(String[] args) {
        new SmartFanApp();
    }
}
