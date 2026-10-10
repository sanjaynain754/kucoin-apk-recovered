package com.scwang.smart.refresh.layout.simple;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import hb0.InterfaceC38157a;
import hb0.InterfaceC38159c;
import hb0.InterfaceC38160d;
import hb0.InterfaceC38161e;
import hb0.InterfaceC38162f;
import ib0.C38510b;

/* JADX INFO: loaded from: classes23.dex */
public abstract class SimpleComponent extends RelativeLayout implements InterfaceC38157a {

    /* JADX INFO: renamed from: b */
    public View f56484b;

    /* JADX INFO: renamed from: c */
    public C38510b f56485c;

    /* JADX INFO: renamed from: d */
    public InterfaceC38157a f56486d;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleComponent(@NonNull View view) {
        this(view, view instanceof InterfaceC38157a ? (InterfaceC38157a) view : null);
    }

    public SimpleComponent(@NonNull View view, @Nullable InterfaceC38157a interfaceC38157a) {
        super(view.getContext(), null, 0);
        this.f56484b = view;
        this.f56486d = interfaceC38157a;
        if ((this instanceof InterfaceC38159c) && (interfaceC38157a instanceof InterfaceC38160d) && interfaceC38157a.getSpinnerStyle() == C38510b.f86473h) {
            interfaceC38157a.getView().setScaleY(-1.0f);
            return;
        }
        if (this instanceof InterfaceC38160d) {
            InterfaceC38157a interfaceC38157a2 = this.f56486d;
            if ((interfaceC38157a2 instanceof InterfaceC38159c) && interfaceC38157a2.getSpinnerStyle() == C38510b.f86473h) {
                interfaceC38157a.getView().setScaleY(-1.0f);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: a */
    public boolean m68575a(boolean z11) {
        InterfaceC38157a interfaceC38157a = this.f56486d;
        return (interfaceC38157a instanceof InterfaceC38159c) && ((InterfaceC38159c) interfaceC38157a).mo33228a(z11);
    }

    @Override // hb0.InterfaceC38157a
    @NonNull
    public C38510b getSpinnerStyle() {
        int i11;
        C38510b c38510b = this.f56485c;
        if (c38510b != null) {
            return c38510b;
        }
        InterfaceC38157a interfaceC38157a = this.f56486d;
        if (interfaceC38157a != null && interfaceC38157a != this) {
            return interfaceC38157a.getSpinnerStyle();
        }
        View view = this.f56484b;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.C27618m) {
                C38510b c38510b2 = ((SmartRefreshLayout.C27618m) layoutParams).f56480b;
                this.f56485c = c38510b2;
                if (c38510b2 != null) {
                    return c38510b2;
                }
            }
            if (layoutParams != null && ((i11 = layoutParams.height) == 0 || i11 == -1)) {
                for (C38510b c38510b3 : C38510b.f86474i) {
                    if (c38510b3.f86477c) {
                        this.f56485c = c38510b3;
                        return c38510b3;
                    }
                }
            }
        }
        C38510b c38510b4 = C38510b.f86469d;
        this.f56485c = c38510b4;
        return c38510b4;
    }

    @Override // hb0.InterfaceC38157a
    @NonNull
    public View getView() {
        View view = this.f56484b;
        return view == null ? this : view;
    }

    @Override // hb0.InterfaceC38157a
    public boolean isSupportHorizontalDrag() {
        InterfaceC38157a interfaceC38157a = this.f56486d;
        return (interfaceC38157a == null || interfaceC38157a == this || !interfaceC38157a.isSupportHorizontalDrag()) ? false : true;
    }

    @Override // hb0.InterfaceC38157a
    public int onFinish(@NonNull InterfaceC38162f interfaceC38162f, boolean z11) {
        InterfaceC38157a interfaceC38157a = this.f56486d;
        if (interfaceC38157a == null || interfaceC38157a == this) {
            return 0;
        }
        return interfaceC38157a.onFinish(interfaceC38162f, z11);
    }

    @Override // hb0.InterfaceC38157a
    public void onHorizontalDrag(float f11, int i11, int i12) {
        InterfaceC38157a interfaceC38157a = this.f56486d;
        if (interfaceC38157a == null || interfaceC38157a == this) {
            return;
        }
        interfaceC38157a.onHorizontalDrag(f11, i11, i12);
    }

    public void onInitialized(@NonNull InterfaceC38161e interfaceC38161e, int i11, int i12) {
        InterfaceC38157a interfaceC38157a = this.f56486d;
        if (interfaceC38157a != null && interfaceC38157a != this) {
            interfaceC38157a.onInitialized(interfaceC38161e, i11, i12);
            return;
        }
        View view = this.f56484b;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.C27618m) {
                interfaceC38161e.mo68570c(this, ((SmartRefreshLayout.C27618m) layoutParams).f56479a);
            }
        }
    }

    public void onMoving(boolean z11, float f11, int i11, int i12, int i13) {
        InterfaceC38157a interfaceC38157a = this.f56486d;
        if (interfaceC38157a == null || interfaceC38157a == this) {
            return;
        }
        interfaceC38157a.onMoving(z11, f11, i11, i12, i13);
    }

    @Override // hb0.InterfaceC38157a
    public void onReleased(@NonNull InterfaceC38162f interfaceC38162f, int i11, int i12) {
        InterfaceC38157a interfaceC38157a = this.f56486d;
        if (interfaceC38157a == null || interfaceC38157a == this) {
            return;
        }
        interfaceC38157a.onReleased(interfaceC38162f, i11, i12);
    }

    @Override // hb0.InterfaceC38157a
    public void onStartAnimator(@NonNull InterfaceC38162f interfaceC38162f, int i11, int i12) {
        InterfaceC38157a interfaceC38157a = this.f56486d;
        if (interfaceC38157a == null || interfaceC38157a == this) {
            return;
        }
        interfaceC38157a.onStartAnimator(interfaceC38162f, i11, i12);
    }

    public void onStateChanged(@NonNull InterfaceC38162f interfaceC38162f, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        InterfaceC38157a interfaceC38157a = this.f56486d;
        if (interfaceC38157a == null || interfaceC38157a == this) {
            return;
        }
        if ((this instanceof InterfaceC38159c) && (interfaceC38157a instanceof InterfaceC38160d)) {
            if (refreshState.isFooter) {
                refreshState = refreshState.toHeader();
            }
            if (refreshState2.isFooter) {
                refreshState2 = refreshState2.toHeader();
            }
        } else if ((this instanceof InterfaceC38160d) && (interfaceC38157a instanceof InterfaceC38159c)) {
            if (refreshState.isHeader) {
                refreshState = refreshState.toFooter();
            }
            if (refreshState2.isHeader) {
                refreshState2 = refreshState2.toFooter();
            }
        }
        InterfaceC38157a interfaceC38157a2 = this.f56486d;
        if (interfaceC38157a2 != null) {
            interfaceC38157a2.onStateChanged(interfaceC38162f, refreshState, refreshState2);
        }
    }

    @Override // hb0.InterfaceC38157a
    public void setPrimaryColors(@ColorInt int... iArr) {
        InterfaceC38157a interfaceC38157a = this.f56486d;
        if (interfaceC38157a == null || interfaceC38157a == this) {
            return;
        }
        interfaceC38157a.setPrimaryColors(iArr);
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if ((obj instanceof InterfaceC38157a) && getView() == ((InterfaceC38157a) obj).getView()) {
            return true;
        }
        return false;
    }
}
