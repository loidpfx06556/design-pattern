package pattern.factory;

import pattern.factory.buttons.Button;
import pattern.factory.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML pattern.factory.buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}