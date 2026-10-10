package k00;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.sdk.res.R$id;

/* JADX INFO: renamed from: k00.g */
/* JADX INFO: compiled from: KucoinLayoutFrameEditBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40843g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f90754a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FilterEmojiEditText f90755b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f90756c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40843g m89383a(@NonNull View view) {
        int i11 = R$id.et_input;
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
        if (filterEmojiEditText != null) {
            i11 = R$id.tv_error;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                return new C40843g((ConstraintLayout) view, filterEmojiEditText, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f90754a;
    }

    public C40843g(@NonNull ConstraintLayout constraintLayout, @NonNull FilterEmojiEditText filterEmojiEditText, @NonNull TextView textView) {
        this.f90754a = constraintLayout;
        this.f90755b = filterEmojiEditText;
        this.f90756c = textView;
    }
}
