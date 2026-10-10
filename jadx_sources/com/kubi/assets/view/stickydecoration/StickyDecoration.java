package com.kubi.assets.view.stickydecoration;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p453mb.AbstractC42500a;
import p453mb.InterfaceC42501b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: StickyDecoration.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/view/stickydecoration/StickyDecoration;", "Lcom/kubi/assets/view/stickydecoration/BaseDecoration;", "groupListener", "Lcom/kubi/assets/view/stickydecoration/StickyDecorationListener;", "<init>", "(Lcom/kubi/assets/view/stickydecoration/StickyDecorationListener;)V", "mGroupListener", "mGroutPaint", "Landroid/graphics/Paint;", "mCachedBitmap", "Landroid/graphics/Bitmap;", "mCachedCanvas", "Landroid/graphics/Canvas;", "onDrawOver", "", "c", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "getOrCreateBitmap", "width", "", "height", "createNewBitmap", "getGroupName", "", ViewProps.POSITION, "getGroupView", "Landroid/view/View;", "Builder", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StickyDecoration extends AbstractC42500a {

    /* JADX INFO: renamed from: j */
    @Nullable
    public final InterfaceC42501b f19153j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Paint f19154k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Bitmap f19155l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Canvas f19156m;

    /* JADX INFO: compiled from: StickyDecoration.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000eJ\u0010\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0018\u001a\u00020\u0007R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/assets/view/stickydecoration/StickyDecorationListener;", "<init>", "(Lcom/kubi/assets/view/stickydecoration/StickyDecorationListener;)V", "mDecoration", "Lcom/kubi/assets/view/stickydecoration/StickyDecoration;", "getMDecoration", "()Lcom/kubi/assets/view/stickydecoration/StickyDecoration;", "setMDecoration", "(Lcom/kubi/assets/view/stickydecoration/StickyDecoration;)V", "setGroupHeight", "groutHeight", "", "setGroupBackground", "background", "isAlignLeft", "b", "", "setDivideHeight", "height", "setDivideColor", "color", "build", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Companion f19157b = new Companion(null);

        /* JADX INFO: renamed from: a */
        @NotNull
        public StickyDecoration f19158a;

        /* JADX INFO: compiled from: StickyDecoration.kt */
        @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder$Companion;", "", "<init>", "()V", "init", "Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/assets/view/stickydecoration/StickyDecorationListener;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            @NotNull
            public final Builder init(@NotNull InterfaceC42501b listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                return new Builder(listener, null);
            }
        }

        public /* synthetic */ Builder(InterfaceC42501b interfaceC42501b, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC42501b);
        }

        public Builder(InterfaceC42501b interfaceC42501b) {
            this.f19158a = new StickyDecoration(interfaceC42501b, null);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final StickyDecoration getF19158a() {
            return this.f19158a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Builder m20055b(int i11) {
            this.f19158a.f94166e = i11;
            return this;
        }
    }

    public /* synthetic */ StickyDecoration(InterfaceC42501b interfaceC42501b, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC42501b);
    }

    public StickyDecoration(InterfaceC42501b interfaceC42501b) {
        this.f19153j = interfaceC42501b;
        Paint paint = new Paint();
        this.f19154k = paint;
        paint.setColor(this.f94165d);
    }

    @Override // p453mb.AbstractC42500a
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo20050a(int i11) {
        InterfaceC42501b interfaceC42501b = this.f19153j;
        if (interfaceC42501b != null) {
            return interfaceC42501b.mo19003a(i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m20051c(int i11, int i12) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.f19155l = bitmapCreateBitmap;
        this.f19156m = new Canvas(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: d */
    public final View m20052d(int i11) {
        InterfaceC42501b interfaceC42501b = this.f19153j;
        if (interfaceC42501b != null) {
            return interfaceC42501b.mo19004b(i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final Bitmap m20053e(int i11, int i12) {
        Bitmap bitmap = this.f19155l;
        if (bitmap != null && bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        return m20051c(i11, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        String str;
        Canvas c12 = c11;
        Intrinsics.checkNotNullParameter(c12, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c11, parent, state);
        int itemCount = state.getItemCount();
        int childCount = parent.getChildCount();
        int paddingStart = parent.getPaddingStart();
        int width = parent.getWidth() - parent.getPaddingEnd();
        String str2 = null;
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = parent.getChildAt(i11);
            int childAdapterPosition = parent.getChildAdapterPosition(childAt);
            String strMo20050a = mo20050a(childAdapterPosition);
            if (strMo20050a == null || TextUtils.equals(strMo20050a, str2)) {
                str = strMo20050a;
                if (str != null && this.f94169h != 0) {
                    float top = childAt.getTop();
                    if (top >= this.f94166e) {
                        c12.drawRect(paddingStart, top - this.f94169h, width, top, this.f94170i);
                    }
                }
            } else {
                int bottom = childAt.getBottom();
                int iCoerceAtLeast = RangesKt.coerceAtLeast(this.f94166e, childAt.getTop());
                int i12 = childAdapterPosition + 1;
                if (i12 >= itemCount || Intrinsics.areEqual(strMo20050a, mo20050a(i12)) || bottom >= iCoerceAtLeast) {
                    bottom = iCoerceAtLeast;
                }
                float f11 = paddingStart;
                str = strMo20050a;
                int i13 = bottom;
                c12.drawRect(f11, bottom - this.f94166e, width, bottom, this.f19154k);
                View viewM20052d = m20052d(childAdapterPosition);
                if (viewM20052d == null) {
                    return;
                }
                viewM20052d.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                viewM20052d.layout(0, 0, width, this.f94166e);
                Bitmap bitmapM20053e = m20053e(width, this.f94166e);
                Canvas canvas = this.f19156m;
                Intrinsics.checkNotNull(canvas);
                bitmapM20053e.eraseColor(0);
                viewM20052d.draw(canvas);
                c12.drawBitmap(bitmapM20053e, f11, i13 - this.f94166e, (Paint) null);
            }
            i11++;
            c12 = c11;
            str2 = str;
        }
    }
}
