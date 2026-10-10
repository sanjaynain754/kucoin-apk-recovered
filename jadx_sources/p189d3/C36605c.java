package p189d3;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.internal.C5760c;
import com.facebook.react.uimanager.TouchTargetHelper;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: d3.c */
/* JADX INFO: compiled from: ViewHierarchy.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010\u0012J%\u0010.\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010\u0018J\u0017\u00101\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u0010\u0003J\u001d\u00106\u001a\b\u0012\u0002\b\u0003\u0018\u0001052\u0006\u00104\u001a\u00020\u0019H\u0002¢\u0006\u0004\b6\u00107R\u001c\u0010:\u001a\n 8*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u001e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010?¨\u0006A"}, m90084d2 = {"Ld3/c;", "", "<init>", "()V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/ViewGroup;", "j", "(Landroid/view/View;)Landroid/view/ViewGroup;", "", "b", "(Landroid/view/View;)Ljava/util/List;", "Lorg/json/JSONObject;", JPushConstants.Analysis.KEY_JSON, "", CmcdData.Factory.STREAMING_FORMAT_SS, "(Landroid/view/View;Lorg/json/JSONObject;)V", "d", "(Landroid/view/View;)Lorg/json/JSONObject;", "", "c", "(Landroid/view/View;)I", "", "o", "(Landroid/view/View;)Z", "", "k", "(Landroid/view/View;)Ljava/lang/String;", "i", "Landroid/view/View$OnClickListener;", "g", "(Landroid/view/View;)Landroid/view/View$OnClickListener;", "newListener", "r", "(Landroid/view/View;Landroid/view/View$OnClickListener;)V", "Landroid/view/View$OnTouchListener;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/view/View;)Landroid/view/View$OnTouchListener;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/view/View;)Landroid/view/View;", "RCTRootView", "p", "(Landroid/view/View;Landroid/view/View;)Z", "e", "", FirebaseAnalytics.Param.LOCATION, CmcdData.Factory.STREAM_TYPE_LIVE, "([FLandroid/view/View;)Landroid/view/View;", "q", "m", "(Landroid/view/View;)[F", "n", "className", "Ljava/lang/Class;", "f", "(Ljava/lang/String;)Ljava/lang/Class;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "RCTRootViewReference", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "methodFindTouchTargetView", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C36605c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C36605c f79406a = new C36605c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C36605c.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static WeakReference<View> RCTRootViewReference = new WeakReference<>(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static Method methodFindTouchTargetView;

    /* JADX INFO: renamed from: m */
    public final float[] m81914m(View view) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final View m81899a(@Nullable View view) {
        if (C42757a.m93689d(C36605c.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f79406a.m81917q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, C36605c.class);
            }
        }
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<View> m81900b(@Nullable View view) {
        if (C42757a.m93689d(C36605c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i11));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C36605c.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final int m81901c(@NotNull View view) {
        if (C42757a.m93689d(C36605c.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            int i11 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i11 |= 32;
            }
            if (m81908o(view)) {
                i11 |= 512;
            }
            if (view instanceof TextView) {
                int i12 = i11 | 1025;
                if (view instanceof Button) {
                    i12 = i11 | 1029;
                    if (view instanceof Switch) {
                        i12 = i11 | 9221;
                    } else if (view instanceof CheckBox) {
                        i12 = 33797 | i11;
                    }
                }
                return view instanceof EditText ? i12 | 2048 : i12;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                if (view instanceof RatingBar) {
                    return 65536 | i11;
                }
                if (view instanceof RadioGroup) {
                    return i11 | 16384;
                }
                return ((view instanceof ViewGroup) && f79406a.m81916p(view, RCTRootViewReference.get())) ? i11 | 64 : i11;
            }
            return i11 | 4096;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C36605c.class);
            return 0;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final JSONObject m81902d(@NotNull View view) {
        if (C42757a.m93689d(C36605c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                RCTRootViewReference = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m81910s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> listM81900b = m81900b(view);
                int size = listM81900b.size();
                for (int i11 = 0; i11 < size; i11++) {
                    jSONArray.put(m81902d(listM81900b.get(i11)));
                }
                jSONObject.put("childviews", jSONArray);
                return jSONObject;
            } catch (JSONException e11) {
                Log.e(TAG, "Failed to create JSONObject for view.", e11);
                return jSONObject;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C36605c.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final View.OnClickListener m81903g(@Nullable View view) {
        Field declaredField;
        if (C42757a.m93689d(C36605c.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View.OnClickListener");
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C36605c.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final View.OnTouchListener m81904h(@Nullable View view) {
        Field declaredField;
        try {
            if (C42757a.m93689d(C36605c.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View.OnTouchListener");
                    return (View.OnTouchListener) obj2;
                } catch (NoSuchFieldException e11) {
                    C5760c.m10063d0(TAG, e11);
                    return null;
                }
            } catch (ClassNotFoundException e12) {
                C5760c.m10063d0(TAG, e12);
                return null;
            } catch (IllegalAccessException e13) {
                C5760c.m10063d0(TAG, e13);
                return null;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C36605c.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m81905i(@Nullable View view) {
        CharSequence hint;
        String string;
        if (C42757a.m93689d(C36605c.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? "" : string;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C36605c.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: j */
    public static final ViewGroup m81906j(@Nullable View view) {
        if (C42757a.m93689d(C36605c.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C36605c.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0104 A[EDGE_INSN: B:43:0x0104->B:44:0x0105 BREAK  A[LOOP:0: B:33:0x00d8->B:39:0x00f2]] */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m81907k(@Nullable View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (C42757a.m93689d(C36605c.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    if (!(view instanceof DatePicker)) {
                        if (!(view instanceof TimePicker)) {
                            if (!(view instanceof RadioGroup)) {
                                if (!(view instanceof RatingBar)) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                            } else {
                                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                                int childCount = ((RadioGroup) view).getChildCount();
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    View childAt = ((RadioGroup) view).getChildAt(i11);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        } else {
                            Integer currentHour = ((TimePicker) view).getCurrentHour();
                            Intrinsics.checkNotNullExpressionValue(currentHour, "view.currentHour");
                            int iIntValue = currentHour.intValue();
                            Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                            Intrinsics.checkNotNullExpressionValue(currentMinute, "view.currentMinute");
                            int iIntValue2 = currentMinute.intValue();
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 2));
                            Intrinsics.checkNotNullExpressionValue(charSequenceValueOf, "format(format, *args)");
                        }
                    } else {
                        int year = ((DatePicker) view).getYear();
                        int month = ((DatePicker) view).getMonth();
                        int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                        Intrinsics.checkNotNullExpressionValue(charSequenceValueOf, "format(format, *args)");
                    }
                } else {
                    if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                        charSequenceValueOf = null;
                        break;
                    }
                    charSequenceValueOf = selectedItem.toString();
                }
            } else {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? "" : string;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C36605c.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m81908o(View view) {
        if (C42757a.m93689d(C36605c.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            C36605c c36605c = f79406a;
            Class<?> clsM81912f = c36605c.m81912f("android.support.v4.view.NestedScrollingChild");
            if (clsM81912f != null && clsM81912f.isInstance(parent)) {
                return true;
            }
            Class<?> clsM81912f2 = c36605c.m81912f("androidx.core.view.NestedScrollingChild");
            return clsM81912f2 != null && clsM81912f2.isInstance(parent);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C36605c.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final void m81909r(@NotNull View view, @Nullable View.OnClickListener newListener) {
        Field declaredField;
        Field declaredField2;
        if (C42757a.m93689d(C36605c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Object obj = null;
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (Exception unused2) {
                    return;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                declaredField = null;
            }
            if (declaredField == null || declaredField2 == null) {
                view.setOnClickListener(newListener);
                return;
            }
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            try {
                declaredField.setAccessible(true);
                obj = declaredField.get(view);
            } catch (IllegalAccessException unused4) {
            }
            if (obj == null) {
                view.setOnClickListener(newListener);
            } else {
                declaredField2.set(obj, newListener);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C36605c.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m81910s(@NotNull View view, @NotNull JSONObject json) {
        if (C42757a.m93689d(C36605c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String strM81907k = m81907k(view);
                String strM81905i = m81905i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", m81901c(view));
                json.put("id", view.getId());
                if (C36603a.m81888g(view)) {
                    json.put("text", "");
                    json.put("is_user_input", true);
                } else {
                    json.put("text", C5760c.m10072j(C5760c.m10086t0(strM81907k), ""));
                }
                json.put("hint", C5760c.m10072j(C5760c.m10086t0(strM81905i), ""));
                if (tag != null) {
                    json.put("tag", C5760c.m10072j(C5760c.m10086t0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    json.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, C5760c.m10072j(C5760c.m10086t0(contentDescription.toString()), ""));
                }
                json.put(TypedValues.Custom.S_DIMENSION, f79406a.m81911e(view));
            } catch (JSONException e11) {
                C5760c.m10063d0(TAG, e11);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C36605c.class);
        }
    }

    /* JADX INFO: renamed from: l */
    public final View m81913l(float[] location, View RCTRootView) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            m81915n();
            Method method = methodFindTouchTargetView;
            if (method != null && RCTRootView != null) {
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Object objInvoke = method.invoke(null, location, RCTRootView);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.view.View");
                    View view = (View) objInvoke;
                    if (view.getId() > 0) {
                        Object parent = view.getParent();
                        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
                        return (View) parent;
                    }
                } catch (IllegalAccessException e11) {
                    C5760c.m10063d0(TAG, e11);
                } catch (InvocationTargetException e12) {
                    C5760c.m10063d0(TAG, e12);
                }
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m81911e(View view) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ViewProps.TOP, view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException e11) {
                Log.e(TAG, "Failed to create JSONObject for dimension.", e11);
                return jSONObject;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final Class<?> m81912f(String className) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m81915n() {
        if (!C42757a.m93689d(this)) {
            try {
                if (methodFindTouchTargetView == null) {
                    try {
                        int i11 = TouchTargetHelper.f9925a;
                        Method declaredMethod = TouchTargetHelper.class.getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                        methodFindTouchTargetView = declaredMethod;
                        if (declaredMethod != null) {
                            declaredMethod.setAccessible(true);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    } catch (ClassNotFoundException e11) {
                        C5760c.m10063d0(TAG, e11);
                    } catch (NoSuchMethodException e12) {
                        C5760c.m10063d0(TAG, e12);
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m81916p(@NotNull View view, @Nullable View RCTRootView) {
        View viewM81913l;
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (!Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") || (viewM81913l = m81913l(m81914m(view), RCTRootView)) == null || viewM81913l.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m81917q(View view) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            return Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }
}
