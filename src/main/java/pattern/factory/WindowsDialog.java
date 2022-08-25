package pattern.factory;

import pattern.factory.buttons.Button;
import pattern.factory.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows pattern.factory.buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}