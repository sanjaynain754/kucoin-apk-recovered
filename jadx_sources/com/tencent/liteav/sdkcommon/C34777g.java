package com.tencent.liteav.sdkcommon;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.g */
/* JADX INFO: loaded from: classes59.dex */
final class C34777g {

    /* JADX INFO: renamed from: c */
    final Context f73642c;

    /* JADX INFO: renamed from: e */
    final ArrayAdapter<String> f73644e;

    /* JADX INFO: renamed from: f */
    WindowManager f73645f;

    /* JADX INFO: renamed from: g */
    View f73646g;

    /* JADX INFO: renamed from: h */
    TextView f73647h;

    /* JADX INFO: renamed from: i */
    TextView f73648i;

    /* JADX INFO: renamed from: j */
    Spinner f73649j;

    /* JADX INFO: renamed from: k */
    ScrollView f73650k;

    /* JADX INFO: renamed from: l */
    String f73651l;

    /* JADX INFO: renamed from: o */
    final a f73654o;

    /* JADX INFO: renamed from: a */
    final DisplayMetrics f73640a = new DisplayMetrics();

    /* JADX INFO: renamed from: b */
    final WindowManager.LayoutParams f73641b = new WindowManager.LayoutParams();

    /* JADX INFO: renamed from: p */
    private final int f73655p = SupportMenu.CATEGORY_MASK;

    /* JADX INFO: renamed from: q */
    private boolean f73656q = false;

    /* JADX INFO: renamed from: m */
    boolean f73652m = false;

    /* JADX INFO: renamed from: n */
    int f73653n = 1920;

    /* JADX INFO: renamed from: d */
    final Handler f73643d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo76165a(int i11);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.g$b */
    public class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: b */
        private int f73658b;

        /* JADX INFO: renamed from: c */
        private int f73659c;

        private b() {
        }

        public /* synthetic */ b(C34777g c34777g, byte b11) {
            this();
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2) {
                    int rawX = (int) motionEvent.getRawX();
                    int rawY = (int) motionEvent.getRawY();
                    int i11 = rawX - this.f73658b;
                    int i12 = rawY - this.f73659c;
                    WindowManager.LayoutParams layoutParams = C34777g.this.f73641b;
                    int i13 = layoutParams.x + i11;
                    layoutParams.x = i13;
                    layoutParams.y += i12;
                    this.f73658b = rawX;
                    this.f73659c = rawY;
                    layoutParams.x = Math.max(i13, 0);
                    WindowManager.LayoutParams layoutParams2 = C34777g.this.f73641b;
                    layoutParams2.y = Math.max(layoutParams2.y, 0);
                    C34777g c34777g = C34777g.this;
                    WindowManager.LayoutParams layoutParams3 = c34777g.f73641b;
                    int i14 = layoutParams3.x;
                    DisplayMetrics displayMetrics = c34777g.f73640a;
                    int i15 = displayMetrics.widthPixels;
                    if (i14 + i15 > i15) {
                        layoutParams3.width = i15 - i14;
                    } else {
                        layoutParams3.width = i15;
                    }
                    int i16 = c34777g.f73653n;
                    layoutParams3.height = i16;
                    if (c34777g.f73652m) {
                        layoutParams3.height = i16 / 2;
                    }
                    int i17 = layoutParams3.y;
                    int i18 = layoutParams3.height + i17;
                    int i19 = displayMetrics.heightPixels;
                    if (i18 > i19) {
                        layoutParams3.height = i19 - i17;
                    }
                    ViewGroup.LayoutParams layoutParams4 = c34777g.f73650k.getLayoutParams();
                    layoutParams4.height = C34777g.this.m76176b();
                    C34777g.this.f73650k.setLayoutParams(layoutParams4);
                    C34777g c34777g2 = C34777g.this;
                    c34777g2.f73645f.updateViewLayout(view, c34777g2.f73641b);
                }
            } else {
                this.f73658b = (int) motionEvent.getRawX();
                this.f73659c = (int) motionEvent.getRawY();
            }
            view.performClick();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.g$c */
    public class c implements AdapterView.OnItemSelectedListener {
        private c() {
        }

        public /* synthetic */ c(C34777g c34777g, byte b11) {
            this();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
            if (view == null) {
                return;
            }
            ((TextView) view).setTextColor(SupportMenu.CATEGORY_MASK);
            C34777g c34777g = C34777g.this;
            c34777g.f73651l = c34777g.f73644e.getItem(i11);
            C34777g.this.f73654o.mo76165a(i11);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76175a(boolean z11) {
        if (z11 == this.f73656q) {
            return;
        }
        if (z11) {
            this.f73645f.addView(this.f73646g, this.f73641b);
        } else {
            this.f73645f.removeView(this.f73646g);
        }
        this.f73656q = z11;
    }

    /* JADX INFO: renamed from: b */
    public final void m76177b(String str) {
        TextView textView = this.f73647h;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public C34777g(Context context, a aVar) {
        this.f73642c = context;
        this.f73654o = aVar;
        this.f73644e = new ArrayAdapter<>(context, R.layout.simple_spinner_item);
    }

    /* JADX INFO: renamed from: b */
    public final int m76176b() {
        return Math.max((this.f73641b.height - m76172a(230)) - m76172a(20), 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m76174a(String str) {
        TextView textView = this.f73648i;
        if (textView != null) {
            textView.setText(str);
        }
        this.f73643d.post(RunnableC34778h.m76178a(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m76173a() {
        TextView textView;
        Spinner spinner = this.f73649j;
        if (spinner == null || (textView = (TextView) spinner.getChildAt(spinner.getSelectedItemPosition())) == null) {
            return;
        }
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
    }

    /* JADX INFO: renamed from: a */
    public final int m76172a(int i11) {
        return (int) ((i11 * this.f73642c.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
