package p637ta;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.round.widget.RoundTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;

/* JADX INFO: renamed from: ta.s2 */
/* JADX INFO: compiled from: AssetViewWithdrawAddressBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44860s2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100775a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f100776b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f100777c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final EditText f100778d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Flow f100779e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f100780f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShapeLinearLayout f100781g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShapeLinearLayout f100782h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShapeLinearLayout f100783i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RoundTextView f100784j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44860s2 m99244a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.addressBookImg;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.addressBookRedDot))) != null) {
            i11 = R$id.etAddress;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i11);
            if (editText != null) {
                i11 = R$id.flow;
                Flow flow = (Flow) ViewBindings.findChildViewById(view, i11);
                if (flow != null) {
                    i11 = R$id.ivDelete;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.llAddressBook;
                        ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (shapeLinearLayout != null) {
                            i11 = R$id.llPaste;
                            ShapeLinearLayout shapeLinearLayout2 = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (shapeLinearLayout2 != null) {
                                i11 = R$id.llScan;
                                ShapeLinearLayout shapeLinearLayout3 = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (shapeLinearLayout3 != null) {
                                    i11 = R$id.tvTag;
                                    RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i11);
                                    if (roundTextView != null) {
                                        return new C44860s2((ConstraintLayout) view, imageView, viewFindChildViewById, editText, flow, imageView2, shapeLinearLayout, shapeLinearLayout2, shapeLinearLayout3, roundTextView);
                                    }
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
        return this.f100775a;
    }

    public C44860s2(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull EditText editText, @NonNull Flow flow, @NonNull ImageView imageView2, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull ShapeLinearLayout shapeLinearLayout2, @NonNull ShapeLinearLayout shapeLinearLayout3, @NonNull RoundTextView roundTextView) {
        this.f100775a = constraintLayout;
        this.f100776b = imageView;
        this.f100777c = view;
        this.f100778d = editText;
        this.f100779e = flow;
        this.f100780f = imageView2;
        this.f100781g = shapeLinearLayout;
        this.f100782h = shapeLinearLayout2;
        this.f100783i = shapeLinearLayout3;
        this.f100784j = roundTextView;
    }
}
