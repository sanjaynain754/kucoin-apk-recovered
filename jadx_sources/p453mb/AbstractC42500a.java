package p453mb;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mb.a */
/* JADX INFO: compiled from: BaseDecoration.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H&R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/view/stickydecoration/BaseDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "<init>", "()V", "mGroupBackground", "", "mGroupHeight", "isAlignLeft", "", "mDivideColor", "mDivideHeight", "mDividePaint", "Landroid/graphics/Paint;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "isFirstInGroup", "pos", "getGroupName", "", ViewProps.POSITION, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbstractC42500a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    @ColorInt
    @JvmField
    public int f94165d = Color.parseColor("#00000000");

    /* JADX INFO: renamed from: e */
    @JvmField
    public int f94166e = 80;

    /* JADX INFO: renamed from: f */
    @JvmField
    public boolean f94167f = !C5303w0.m6511a();

    /* JADX INFO: renamed from: g */
    @ColorInt
    @JvmField
    public int f94168g = Color.parseColor("#CCCCCC");

    /* JADX INFO: renamed from: h */
    @JvmField
    public int f94169h;

    /* JADX INFO: renamed from: i */
    @JvmField
    @NotNull
    public Paint f94170i;

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract String mo20050a(int i11);

    /* JADX INFO: renamed from: b */
    public final boolean m93185b(int i11) {
        return i11 == 0 || !TextUtils.equals(mo20050a(i11 + (-1)), mo20050a(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (mo20050a(childAdapterPosition) == null) {
            return;
        }
        if (childAdapterPosition == 0 || m93185b(childAdapterPosition)) {
            outRect.top = this.f94166e;
        } else {
            outRect.top = this.f94169h;
        }
    }

    public AbstractC42500a() {
        Paint paint = new Paint();
        this.f94170i = paint;
        paint.setColor(this.f94168g);
    }
}
