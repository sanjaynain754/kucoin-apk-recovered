package c70;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.o0 */
/* JADX INFO: compiled from: BusercenterViewDeleteAccountReasonsBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4888o0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f5258a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CheckBox f5259b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CheckBox f5260c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CheckBox f5261d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final CheckBox f5262e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final EditText f5263f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcPrimaryButton f5264g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f5265h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4888o0 m5055a(@NonNull View view) {
        int i11 = R$id.cb_delete_account_reason_1;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
        if (checkBox != null) {
            i11 = R$id.cb_delete_account_reason_2;
            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, i11);
            if (checkBox2 != null) {
                i11 = R$id.cb_delete_account_reason_4;
                CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(view, i11);
                if (checkBox3 != null) {
                    i11 = R$id.cb_delete_account_reason_5;
                    CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(view, i11);
                    if (checkBox4 != null) {
                        i11 = R$id.et_other_reason;
                        EditText editText = (EditText) ViewBindings.findChildViewById(view, i11);
                        if (editText != null) {
                            i11 = R$id.tv_next;
                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                            if (kcPrimaryButton != null) {
                                i11 = R$id.tv_reasons_title;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView != null) {
                                    return new C4888o0((ConstraintLayout) view, checkBox, checkBox2, checkBox3, checkBox4, editText, kcPrimaryButton, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f5258a;
    }

    public C4888o0(@NonNull ConstraintLayout constraintLayout, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull CheckBox checkBox3, @NonNull CheckBox checkBox4, @NonNull EditText editText, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull TextView textView) {
        this.f5258a = constraintLayout;
        this.f5259b = checkBox;
        this.f5260c = checkBox2;
        this.f5261d = checkBox3;
        this.f5262e = checkBox4;
        this.f5263f = editText;
        this.f5264g = kcPrimaryButton;
        this.f5265h = textView;
    }
}
