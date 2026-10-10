package io.trtc.tuikit.atomicxcore.impl.view.live.layer;

import android.R;
import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.live.C39763o1;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.layer.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C40118e extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public static final SparseArray f89236g;

    /* JADX INFO: renamed from: a */
    public final int f89237a;

    /* JADX INFO: renamed from: b */
    public final C39510r f89238b;

    /* JADX INFO: renamed from: c */
    public C39763o1 f89239c;

    /* JADX INFO: renamed from: d */
    public boolean f89240d;

    /* JADX INFO: renamed from: e */
    public int f89241e;

    /* JADX INFO: renamed from: f */
    public int f89242f;

    /* JADX INFO: renamed from: a */
    public final float m88491a(C39763o1 c39763o1) {
        float h11;
        int h12;
        float w11 = c39763o1.f88357a.getW() / c39763o1.f88357a.getH();
        float f11 = this.f89241e;
        float f12 = f11 / this.f89242f;
        float w12 = f11 / c39763o1.f88357a.getW();
        if (w11 >= f12) {
            h11 = (c39763o1.f88357a.getW() * this.f89242f) / c39763o1.f88357a.getH();
            if (601 != c39763o1.f88357a.getTemplateID()) {
                return w12;
            }
            h12 = c39763o1.f88357a.getW();
        } else {
            h11 = (c39763o1.f88357a.getH() * this.f89241e) / c39763o1.f88357a.getW();
            if (601 == c39763o1.f88357a.getTemplateID()) {
                h12 = c39763o1.f88357a.getH();
            } else {
                h11 = this.f89242f;
                h12 = c39763o1.f88357a.getH();
            }
        }
        return h11 / h12;
    }

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, "VISIBLE");
        sparseArray.put(4, "INVISIBLE");
        sparseArray.put(8, "GONE");
        f89236g = sparseArray;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40118e(Context context, String roomId) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        int iHashCode = hashCode();
        this.f89237a = iHashCode;
        C39510r c39510rM88229a = AbstractC39398a.m88229a("TemplateView", "file", "AtomicXCore-Live", "TemplateView");
        this.f89238b = c39510rM88229a;
        String message = "TemplateView new OID:" + iHashCode + ", roomId:" + roomId;
        Intrinsics.checkNotNullParameter(message, "message");
        c39510rM88229a.m88251a(0, message);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f89241e = (int) ((context.getResources().getDisplayMetrics().density * 720.0f) + 0.5f);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f89242f = (int) ((context.getResources().getDisplayMetrics().density * 1280.0f) + 0.5f);
    }

    @Nullable
    public final C39763o1 getTemplate() {
        return this.f89239c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        int x11;
        C39763o1 c39763o1 = this.f89239c;
        List list = c39763o1 != null ? c39763o1.f88358b : null;
        if (list == null || list.isEmpty()) {
            super.onLayout(z11, i11, i12, i13, i14);
            return;
        }
        if (getChildCount() <= 0) {
            super.onLayout(z11, i11, i12, i13, i14);
            return;
        }
        C39763o1 c39763o2 = this.f89239c;
        Intrinsics.checkNotNull(c39763o2);
        int childCount = getChildCount();
        C39763o1 c39763o3 = this.f89239c;
        int i15 = 0;
        if ((c39763o3 != null ? c39763o3.f88358b : null) != null) {
            Intrinsics.checkNotNull(c39763o3);
            Iterator it = c39763o3.f88358b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z12 = false;
                    break;
                }
                SeatInfo seatInfo = (SeatInfo) it.next();
                if (seatInfo != null && Intrinsics.areEqual(TUIRoomEngine.getSelfInfo().userId, seatInfo.getUserInfo().getUserID())) {
                    z12 = true;
                    break;
                }
            }
        } else {
            z12 = false;
            break;
        }
        float fM88491a = m88491a(c39763o2);
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            Object tag = childAt.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.SeatInfo");
            SeatInfo seatInfo2 = (SeatInfo) tag;
            Point point = new Point(i15, i15);
            if (601 == c39763o2.f88357a.getTemplateID() && !z12 && seatInfo2.getRegion().getH() < c39763o2.f88357a.getH() && seatInfo2.getRegion().getW() < c39763o2.f88357a.getW()) {
                float w11 = c39763o2.f88357a.getW() / c39763o2.f88357a.getH();
                float f11 = this.f89241e / this.f89242f;
                float w12 = (c39763o2.f88357a.getW() * this.f89242f) / c39763o2.f88357a.getH();
                float h11 = (c39763o2.f88357a.getH() * this.f89241e) / c39763o2.f88357a.getW();
                if (w11 >= f11) {
                    point.x = (int) ((w12 / 2) * (1 - (f11 / w11)));
                } else {
                    point.y = (int) ((h11 / 2) * (1 - (w11 / f11)));
                }
            }
            if (601 == c39763o2.f88357a.getTemplateID() && z12 && seatInfo2.getRegion().getH() < c39763o2.f88357a.getH() && seatInfo2.getRegion().getW() < c39763o2.f88357a.getW()) {
                int measuredWidth = this.f89241e - childAt.getMeasuredWidth();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                x11 = measuredWidth - ((int) ((context.getResources().getDisplayMetrics().density * 12.0f) + 0.5f));
            } else {
                x11 = (int) ((seatInfo2.getRegion().getX() * fM88491a) - point.x);
            }
            int y11 = (int) ((seatInfo2.getRegion().getY() * fM88491a) - point.y);
            childAt.layout(x11, y11, childAt.getMeasuredWidth() + x11, childAt.getMeasuredHeight() + y11);
            i16++;
            i15 = 0;
        }
    }

    public final void setBackgroundTransparent(boolean z11) {
        if (z11 != this.f89240d) {
            this.f89240d = z11;
        }
    }

    public final void setTemplate(@Nullable C39763o1 c39763o1) {
        this.f89239c = c39763o1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        List list;
        super.onMeasure(i11, i12);
        C39763o1 c39763o1 = this.f89239c;
        if (c39763o1 != null) {
            list = c39763o1.f88358b;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            this.f89241e = getMeasuredWidth();
            this.f89242f = getMeasuredHeight();
            C39763o1 c39763o2 = this.f89239c;
            Intrinsics.checkNotNull(c39763o2);
            if (this.f89240d) {
                setBackgroundResource(R.color.transparent);
            }
            int childCount = getChildCount();
            if (childCount > 0) {
                if (m88490a(c39763o2, null)) {
                    getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(this.f89241e, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f89242f, 1073741824));
                    return;
                }
                float fM88491a = m88491a(c39763o2);
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    Object tag = childAt.getTag();
                    Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.SeatInfo");
                    SeatInfo seatInfo = (SeatInfo) tag;
                    if (childAt.getVisibility() != 8) {
                        int w11 = (int) (seatInfo.getRegion().getW() * fM88491a);
                        int h11 = (int) (seatInfo.getRegion().getH() * fM88491a);
                        if (m88490a(c39763o2, seatInfo)) {
                            w11 = this.f89241e;
                            h11 = this.f89242f;
                        }
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(w11, 1073741824), View.MeasureSpec.makeMeasureSpec(h11, 1073741824));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        C39510r c39510r = this.f89238b;
        String message = "setVisibility OID:" + this.f89237a + " visibility:" + ((String) f89236g.get(i11));
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m88490a(C39763o1 c39763o1, SeatInfo seatInfo) {
        List list = c39763o1.f88358b;
        if (list == null || list.size() <= 1) {
            return true;
        }
        return seatInfo != null && seatInfo.getRegion().getW() == c39763o1.f88357a.getW() && seatInfo.getRegion().getH() == c39763o1.f88357a.getH();
    }
}
