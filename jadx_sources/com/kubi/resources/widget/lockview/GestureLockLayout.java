package com.kubi.resources.widget.lockview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.blankj.utilcode.util.C5274i;
import com.blankj.utilcode.util.C5280l;
import com.kubi.sdk.res.R$color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class GestureLockLayout extends RelativeLayout {

    /* JADX INFO: renamed from: b */
    public int f44952b;

    /* JADX INFO: renamed from: c */
    public int f44953c;

    /* JADX INFO: renamed from: d */
    public ArrayList<InterfaceC23096b> f44954d;

    /* JADX INFO: renamed from: e */
    public InterfaceC23097c f44955e;

    /* JADX INFO: renamed from: f */
    public int f44956f;

    /* JADX INFO: renamed from: g */
    public Paint f44957g;

    /* JADX INFO: renamed from: h */
    public Path f44958h;

    /* JADX INFO: renamed from: i */
    public float f44959i;

    /* JADX INFO: renamed from: j */
    public int f44960j;

    /* JADX INFO: renamed from: k */
    public int f44961k;

    /* JADX INFO: renamed from: l */
    public int f44962l;

    /* JADX INFO: renamed from: m */
    public float f44963m;

    /* JADX INFO: renamed from: n */
    public float f44964n;

    /* JADX INFO: renamed from: o */
    public float f44965o;

    /* JADX INFO: renamed from: p */
    public float f44966p;

    /* JADX INFO: renamed from: q */
    public ArrayList<Integer> f44967q;

    /* JADX INFO: renamed from: r */
    public ArrayList<Integer> f44968r;

    /* JADX INFO: renamed from: s */
    public boolean f44969s;

    /* JADX INFO: renamed from: t */
    public int f44970t;

    /* JADX INFO: renamed from: u */
    public int f44971u;

    /* JADX INFO: renamed from: v */
    public InterfaceC23094c f44972v;

    /* JADX INFO: renamed from: w */
    public InterfaceC23093b f44973w;

    /* JADX INFO: renamed from: x */
    public int f44974x;

    /* JADX INFO: renamed from: y */
    public int f44975y;

    /* JADX INFO: renamed from: z */
    public String f44976z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C23091a();
        int tryTimes;

        /* JADX INFO: renamed from: com.kubi.resources.widget.lockview.GestureLockLayout$SavedState$a */
        public class C23091a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.tryTimes = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.tryTimes);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.lockview.GestureLockLayout$b */
    public interface InterfaceC23093b {
        /* JADX INFO: renamed from: a */
        void m55397a(boolean z11, List<Integer> list);

        /* JADX INFO: renamed from: b */
        void m55398b(int i11, int i12);

        /* JADX INFO: renamed from: c */
        void m55399c(List<Integer> list);
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.lockview.GestureLockLayout$c */
    public interface InterfaceC23094c {
        /* JADX INFO: renamed from: a */
        void m55400a(int i11);

        /* JADX INFO: renamed from: b */
        void m55401b(boolean z11);

        /* JADX INFO: renamed from: c */
        void m55402c();
    }

    public GestureLockLayout(Context context) {
        this(context, null);
    }

    public void setAnswer(List<Integer> list) {
        this.f44968r.clear();
        this.f44968r.addAll(list);
    }

    public GestureLockLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44952b = 0;
        this.f44953c = 0;
        this.f44954d = new ArrayList<>(1);
        this.f44955e = null;
        this.f44956f = 3;
        this.f44959i = 1.0f;
        this.f44963m = 0.0f;
        this.f44964n = 0.0f;
        this.f44965o = 0.0f;
        this.f44966p = 0.0f;
        this.f44967q = new ArrayList<>(1);
        this.f44968r = new ArrayList<>(1);
        this.f44969s = true;
        this.f44970t = 5;
        this.f44971u = 5;
        this.f44974x = 0;
        this.f44975y = 4;
        this.f44976z = null;
        m55391k(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC23096b m55381a(Context context) {
        return new LockView(context);
    }

    private void setLockViewParams(InterfaceC23097c interfaceC23097c) {
        if (this.f44954d.size() > 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            int i12 = this.f44956f;
            if (i11 >= i12 * i12) {
                return;
            }
            InterfaceC23096b interfaceC23096bMo55412a = interfaceC23097c.mo55412a();
            int i13 = i11 + 1;
            interfaceC23096bMo55412a.getView().setId(i13);
            this.f44954d.add(interfaceC23096bMo55412a);
            int i14 = this.f44952b;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i14, i14);
            if (i11 % this.f44956f != 0) {
                layoutParams.addRule(1, this.f44954d.get(i11 - 1).getView().getId());
            }
            int i15 = this.f44956f;
            if (i11 > i15 - 1) {
                layoutParams.addRule(3, this.f44954d.get(i11 - i15).getView().getId());
            }
            int i16 = this.f44953c;
            int i17 = this.f44956f;
            layoutParams.setMargins(i11 % i17 == 0 ? i16 : 0, i11 < i17 ? i16 : 0, i16, i16);
            this.f44954d.get(i11).mo55403a();
            this.f44954d.get(i11).getView().setLayoutParams(layoutParams);
            addView(this.f44954d.get(i11).getView());
            i11 = i13;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m55382b() {
        if (!TextUtils.isEmpty(this.f44976z) && this.f44974x != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.f44967q.size(); i11++) {
                arrayList.add(i11, Integer.valueOf(this.f44967q.get(i11).intValue() - 1));
            }
            return m55384d(arrayList).equals(this.f44976z);
        }
        if (this.f44968r.size() != this.f44967q.size()) {
            return false;
        }
        for (int i12 = 0; i12 < this.f44968r.size(); i12++) {
            if (this.f44968r.get(i12).intValue() != this.f44967q.get(i12).intValue() - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m55383c(View view, int i11, int i12) {
        int i13 = (int) (((double) this.f44952b) * 0.1d);
        return i11 >= view.getLeft() + i13 && i11 <= view.getRight() - i13 && i12 >= view.getTop() + i13 && i12 <= view.getBottom() - i13;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC23096b m55385e(int i11, int i12) {
        for (InterfaceC23096b interfaceC23096b : this.f44954d) {
            if (m55383c(interfaceC23096b.getView(), i11, i12)) {
                return interfaceC23096b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m55387g(int i11, int i12) {
        this.f44957g.setColor(this.f44960j);
        InterfaceC23096b interfaceC23096bM55385e = m55385e(i11, i12);
        if (interfaceC23096bM55385e != null) {
            int id2 = interfaceC23096bM55385e.getView().getId();
            if (!this.f44967q.contains(Integer.valueOf(id2))) {
                this.f44967q.add(Integer.valueOf(id2));
                interfaceC23096bM55385e.mo55405c();
                InterfaceC23094c interfaceC23094c = this.f44972v;
                if (interfaceC23094c != null) {
                    interfaceC23094c.m55400a(id2);
                }
                this.f44963m = (interfaceC23096bM55385e.getView().getLeft() / 2) + (interfaceC23096bM55385e.getView().getRight() / 2);
                this.f44964n = (interfaceC23096bM55385e.getView().getTop() / 2) + (interfaceC23096bM55385e.getView().getBottom() / 2);
                if (this.f44967q.size() == 1) {
                    this.f44958h.moveTo(this.f44963m, this.f44964n);
                } else {
                    this.f44958h.lineTo(this.f44963m, this.f44964n);
                }
            }
        }
        this.f44965o = i11;
        this.f44966p = i12;
    }

    public int getTryTimes() {
        return this.f44970t;
    }

    /* JADX INFO: renamed from: h */
    public final void m55388h() {
        if (this.f44968r.size() > 0) {
            if (m55382b()) {
                m55394n(true);
                InterfaceC23093b interfaceC23093b = this.f44973w;
                if (interfaceC23093b != null) {
                    interfaceC23093b.m55397a(true, this.f44968r);
                    return;
                }
                return;
            }
            m55394n(false);
            InterfaceC23093b interfaceC23093b2 = this.f44973w;
            if (interfaceC23093b2 != null) {
                interfaceC23093b2.m55397a(false, new ArrayList(1));
                return;
            }
            return;
        }
        if (this.f44967q.size() < this.f44975y) {
            InterfaceC23093b interfaceC23093b3 = this.f44973w;
            if (interfaceC23093b3 != null) {
                interfaceC23093b3.m55398b(this.f44967q.size(), this.f44975y);
            }
            m55394n(false);
            return;
        }
        Iterator<Integer> it = this.f44967q.iterator();
        while (it.hasNext()) {
            this.f44968r.add(Integer.valueOf(it.next().intValue() - 1));
        }
        InterfaceC23093b interfaceC23093b4 = this.f44973w;
        if (interfaceC23093b4 != null) {
            interfaceC23093b4.m55399c(this.f44968r);
        }
        m55394n(true);
    }

    /* JADX INFO: renamed from: i */
    public final void m55389i() {
        if (this.f44974x == 0) {
            m55388h();
        } else {
            m55390j();
        }
        this.f44965o = this.f44963m;
        this.f44966p = this.f44964n;
    }

    /* JADX INFO: renamed from: j */
    public final void m55390j() {
        this.f44970t--;
        boolean zM55382b = m55382b();
        InterfaceC23094c interfaceC23094c = this.f44972v;
        if (interfaceC23094c != null) {
            interfaceC23094c.m55401b(zM55382b);
            if (this.f44970t <= 0) {
                this.f44972v.m55402c();
            }
        }
        if (zM55382b) {
            m55394n(true);
        } else {
            m55394n(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m55391k(final Context context) {
        if (this.f44955e == null) {
            setLockView(new InterfaceC23097c() { // from class: com.kubi.resources.widget.lockview.a
                @Override // com.kubi.resources.widget.lockview.InterfaceC23097c
                /* JADX INFO: renamed from: a */
                public final InterfaceC23096b mo55412a() {
                    return GestureLockLayout.m55381a(context);
                }
            });
        }
        Paint paint = new Paint();
        this.f44957g = paint;
        paint.setAntiAlias(true);
        this.f44957g.setStyle(Paint.Style.STROKE);
        this.f44957g.setStrokeWidth(C5274i.m6235c(this.f44959i));
        this.f44957g.setStrokeCap(Paint.Cap.ROUND);
        this.f44957g.setStrokeJoin(Paint.Join.ROUND);
        this.f44958h = new Path();
        Resources resources = getResources();
        int i11 = R$color.primary;
        this.f44960j = resources.getColor(i11);
        this.f44961k = getResources().getColor(i11);
        this.f44962l = getResources().getColor(R$color.secondary);
    }

    /* JADX INFO: renamed from: l */
    public final void m55392l() {
        ArrayList<Integer> arrayList = this.f44967q;
        if (arrayList == null || this.f44958h == null || this.f44954d == null) {
            return;
        }
        arrayList.clear();
        this.f44958h.reset();
        Iterator<InterfaceC23096b> it = this.f44954d.iterator();
        while (it.hasNext()) {
            it.next().mo55403a();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m55394n(boolean z11) {
        if (z11) {
            this.f44957g.setColor(this.f44961k);
        } else {
            this.f44957g.setColor(this.f44962l);
        }
        for (InterfaceC23096b interfaceC23096b : this.f44954d) {
            if (this.f44967q.contains(Integer.valueOf(interfaceC23096b.getView().getId()))) {
                if (z11) {
                    interfaceC23096b.mo55406d();
                } else {
                    interfaceC23096b.mo55404b();
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f44970t = savedState.tryTimes;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f44969s) {
            return false;
        }
        int action = motionEvent.getAction();
        int x11 = (int) motionEvent.getX();
        int y11 = (int) motionEvent.getY();
        if (action == 0) {
            m55386f(x11, y11);
        } else if (action == 1) {
            m55389i();
        } else if (action == 2) {
            m55387g(x11, y11);
        }
        invalidate();
        return true;
    }

    public void setDotCount(int i11) {
        this.f44956f = i11;
    }

    public void setEncryptedGesture(String str) {
        this.f44976z = str;
    }

    public void setLockView(InterfaceC23097c interfaceC23097c) {
        if (interfaceC23097c != null) {
            removeAllViewsInLayout();
            this.f44954d.clear();
            this.f44955e = interfaceC23097c;
            if (this.f44952b > 0) {
                setLockViewParams(interfaceC23097c);
                m55392l();
            }
        }
    }

    public void setMatchedPathColor(int i11) {
        this.f44961k = i11;
    }

    public void setMinCount(int i11) {
        this.f44975y = i11;
    }

    public void setMode(int i11) {
        this.f44974x = i11;
        m55392l();
        int i12 = this.f44974x;
        if (i12 == 1) {
            this.f44970t = this.f44971u;
        } else if (i12 == 0) {
            this.f44968r.clear();
        }
    }

    public void setOnLockResetListener(InterfaceC23093b interfaceC23093b) {
        this.f44973w = interfaceC23093b;
    }

    public void setOnLockVerifyListener(InterfaceC23094c interfaceC23094c) {
        this.f44972v = interfaceC23094c;
    }

    public void setPathWidth(float f11) {
        this.f44957g.setStrokeWidth(C5274i.m6235c(f11));
    }

    public void setTouchable(boolean z11) {
        this.f44969s = z11;
        m55392l();
        invalidate();
    }

    public void setTouchedPathColor(int i11) {
        this.f44960j = i11;
    }

    public void setTryTimes(int i11) {
        this.f44970t = i11;
        this.f44971u = i11;
    }

    public void setUnmatchedPathColor(int i11) {
        this.f44962l = i11;
    }

    /* JADX INFO: renamed from: d */
    public String m55384d(List<Integer> list) {
        return C5280l.m6263c(list.toString(), "Kucoin");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.f44958h, this.f44957g);
        if (this.f44967q.size() > 0) {
            canvas.drawLine(this.f44963m, this.f44964n, this.f44965o, this.f44966p, this.f44957g);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m55386f(int i11, int i12) {
        m55392l();
        m55387g(i11, i12);
    }

    /* JADX INFO: renamed from: m */
    public void m55393m() {
        m55392l();
        invalidate();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int iMin = (int) (((Math.min(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12)) * 4) * 1.0f) / ((this.f44956f * 5) + 1));
        this.f44952b = iMin;
        this.f44953c = (int) (((double) iMin) * 0.25d);
        InterfaceC23097c interfaceC23097c = this.f44955e;
        if (interfaceC23097c != null) {
            setLockViewParams(interfaceC23097c);
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.tryTimes = this.f44970t;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
    }

    public void setAnswer(String str) {
        if (str.startsWith("[") && str.endsWith("]")) {
            String[] strArrSplit = str.substring(1, str.length() - 1).split(",");
            this.f44968r.clear();
            for (String str2 : strArrSplit) {
                this.f44968r.add(Integer.valueOf(Integer.parseInt(str2.trim())));
            }
        }
    }
}
