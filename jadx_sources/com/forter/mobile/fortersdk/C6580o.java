package com.forter.mobile.fortersdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.o */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 17)
public final class C6580o implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final DisplayManager f11014a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<C6639z3> f11015b = new SparseArray<>();

    /* JADX INFO: renamed from: c */
    public final Handler f11016c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public boolean f11017d;

    /* JADX INFO: renamed from: e */
    public boolean f11018e;

    /* JADX INFO: renamed from: f */
    public boolean f11019f;

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.o$a */
    /* JADX INFO: loaded from: classes45.dex */
    public enum a {
        ADDED,
        CHANGED,
        REMOVED
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final C6639z3 m12439a(int i11) {
        Display display;
        C6639z3 c6639z3 = this.f11015b.get(i11);
        if (c6639z3 != null) {
            return c6639z3;
        }
        C6639z3 c6639z4 = new C6639z3(i11);
        DisplayManager displayManager = this.f11014a;
        if (displayManager != null && (display = displayManager.getDisplay(i11)) != null) {
            c6639z4.f11098b = display.getName();
            try {
                Field declaredField = Display.class.getDeclaredField("mOwnerPackageName");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(display);
                if (obj instanceof String) {
                    c6639z4.f11099c = (String) obj;
                }
            } catch (Throwable unused) {
            }
        }
        this.f11015b.put(i11, c6639z4);
        return c6639z4;
    }

    /* JADX INFO: renamed from: b */
    public final void m12440b() {
        try {
            DisplayManager displayManager = this.f11014a;
            if (displayManager != null) {
                displayManager.registerDisplayListener(this, this.f11016c);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i11) {
        try {
            if (this.f11017d && i11 != 0) {
                C6639z3 c6639z3M12439a = m12439a(i11);
                if (C6520c.m12182b().m12193l(false)) {
                    AbstractC6609t3.m12479f(a.ADDED.name(), c6639z3M12439a);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i11) {
        try {
            if (this.f11019f && i11 != 0) {
                C6639z3 c6639z3M12439a = m12439a(i11);
                if (C6520c.m12182b().m12193l(false)) {
                    AbstractC6609t3.m12479f(a.CHANGED.name(), c6639z3M12439a);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i11) {
        try {
            if (this.f11018e && i11 != 0) {
                C6639z3 c6639z3M12439a = m12439a(i11);
                this.f11015b.remove(i11);
                if (C6520c.m12182b().m12193l(false)) {
                    AbstractC6609t3.m12479f(a.REMOVED.name(), c6639z3M12439a);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public C6580o(@NonNull Context context, @NonNull JSONArray jSONArray) {
        this.f11017d = false;
        this.f11018e = false;
        this.f11019f = false;
        this.f11014a = (DisplayManager) context.getSystemService("display");
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            String strOptString = jSONArray.optString(i11);
            if ("added".equals(strOptString)) {
                this.f11017d = true;
            } else if ("removed".equals(strOptString)) {
                this.f11018e = true;
            } else if ("changed".equals(strOptString)) {
                this.f11019f = true;
            }
        }
    }
}
