package view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import ru.ivanmurzin.fooddeliveryapp.R;
import ru.ivanmurzin.fooddeliveryapp.databinding.ViewActionButtonBinding;
import ru.ivanmurzin.fooddeliveryapp.databinding.ViewInputFieldBinding;

public class ActionButton extends FrameLayout {


    ViewActionButtonBinding binding;

    public ActionButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(attrs);
    }

    public ActionButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(attrs);
    }

    private void initView(AttributeSet attrs) {
        binding = ViewActionButtonBinding.inflate(LayoutInflater.from(getContext()), this, true);
        TypedArray attributes = getContext().getTheme().obtainStyledAttributes(attrs,
                R.styleable.InputField,
                0, 0);
        try {
            String text = attributes.getString(R.styleable.ActionButton_android_text);
            boolean textAllCaps = attributes.getBoolean(R.styleable.ActionButton_android_textAllCaps, true);
            binding.getRoot().setText("Войти");
            binding.getRoot().setAllCaps(textAllCaps);
        } finally {
            attributes.recycle();
        }
    }
}
