package com.sumsub.sns.internal.core.common;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Build;
import android.os.LocaleList;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.io.File;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.CharsKt;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28458h {
    /* JADX INFO: renamed from: a */
    public static final String m69333a(Object obj) {
        return obj.getClass().getSimpleName() + "@" + System.identityHashCode(obj);
    }

    /* JADX INFO: renamed from: b */
    public static final String m69349b() {
        String string = Build.MANUFACTURER;
        String str = Build.MODEL;
        Locale locale = Locale.ROOT;
        if (StringsKt.startsWith$default(str.toLowerCase(locale), string.toLowerCase(locale), false, 2, (Object) null)) {
            if (str.length() <= 0) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            char cCharAt = str.charAt(0);
            sb2.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt.titlecase(cCharAt) : String.valueOf(cCharAt)));
            sb2.append(str.substring(1));
            return sb2.toString();
        }
        if (string.length() > 0) {
            StringBuilder sb3 = new StringBuilder();
            char cCharAt2 = string.charAt(0);
            sb3.append((Object) (Character.isLowerCase(cCharAt2) ? CharsKt.titlecase(cCharAt2) : String.valueOf(cCharAt2)));
            sb3.append(string.substring(1));
            string = sb3.toString();
        }
        return string + C33627eb.f69716f + str;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m69347a(AbstractC29172p abstractC29172p, ReviewStatusType reviewStatusType) {
        boolean z11 = abstractC29172p.mo69762m().f59165b == ReviewStatusType.Init;
        boolean z12 = abstractC29172p.m69800p() && !abstractC29172p.m69799o();
        ReviewStatusType reviewStatusType2 = abstractC29172p.mo69762m().f59165b;
        ReviewStatusType reviewStatusType3 = ReviewStatusType.Processing;
        boolean z13 = reviewStatusType2 == reviewStatusType3;
        boolean z14 = abstractC29172p.mo69762m().f59165b == ReviewStatusType.RequiresAction || abstractC29172p.mo69762m().f59165b == ReviewStatusType.AwaitingService;
        ReviewStatusType reviewStatusType4 = abstractC29172p.mo69762m().f59165b;
        ReviewStatusType reviewStatusType5 = ReviewStatusType.Pending;
        boolean z15 = reviewStatusType4 == reviewStatusType5;
        boolean z16 = reviewStatusType == reviewStatusType3;
        boolean z17 = reviewStatusType == reviewStatusType5;
        if (z11 || z12) {
            return true;
        }
        if ((z13 || z14) && z16) {
            return true;
        }
        return z15 && z17;
    }

    /* JADX INFO: renamed from: c */
    public static final void m69353c(View view) {
        view.setVisibility(8);
        view.setTag(R$id.ANIMATION_TAG, 0);
    }

    /* JADX INFO: renamed from: d */
    public static final void m69354d(final View view) {
        int i11 = R$id.ANIMATION_TAG;
        if (Intrinsics.areEqual(view.getTag(i11), (Object) 1) || view.getVisibility() == 0) {
            return;
        }
        view.setTag(i11, 1);
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(100L).withEndAction(new Runnable() { // from class: com.sumsub.sns.internal.core.common.v1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC28458h.m69355e(view);
            }
        }).start();
    }

    /* JADX INFO: renamed from: e */
    public static final void m69355e(View view) {
        view.setTag(R$id.ANIMATION_TAG, 0);
    }

    /* JADX INFO: renamed from: f */
    public static final void m69356f(final View view) {
        view.postDelayed(new Runnable() { // from class: com.sumsub.sns.internal.core.common.u1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC28458h.m69357g(view);
            }
        }, view.getResources().getInteger(R.integer.config_shortAnimTime));
    }

    /* JADX INFO: renamed from: g */
    public static final void m69357g(View view) {
        if (view.requestFocus()) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m69351b(final View view) {
        int i11 = R$id.ANIMATION_TAG;
        if (Intrinsics.areEqual(view.getTag(i11), (Object) 1) || view.getAlpha() != 1.0f) {
            return;
        }
        view.setTag(i11, 1);
        view.setAlpha(1.0f);
        view.animate().alpha(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: com.sumsub.sns.internal.core.common.w1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC28458h.m69353c(view);
            }
        }).start();
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC28489r0 m69348b(Context context) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("nfc");
            NfcManager nfcManager = systemService instanceof NfcManager ? (NfcManager) systemService : null;
            objM103844constructorimpl = Result.m103844constructorimpl(nfcManager != null ? nfcManager.getDefaultAdapter() : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl == null) {
            NfcAdapter nfcAdapter = (NfcAdapter) objM103844constructorimpl;
            if (!C33048a.f67455R.m71434a() && context.getPackageManager().hasSystemFeature("android.hardware.nfc")) {
                if (nfcAdapter != null && nfcAdapter.isEnabled()) {
                    return C28480o0.f58016b;
                }
                if (nfcAdapter != null) {
                    return C28477n0.f58014b;
                }
                return C28486q0.f58024b;
            }
            return C28486q0.f58024b;
        }
        return new C28483p0(thM103847exceptionOrNullimpl);
    }

    /* JADX INFO: renamed from: a */
    public static final Locale m69337a() {
        return LocaleList.getDefault().get(0);
    }

    /* JADX INFO: renamed from: a */
    public static final String m69334a(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));
        }
        return android.util.Base64.encodeToString(str.getBytes(Charsets.UTF_8), 10);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m69345a(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            try {
                context.startActivity(intent);
                return true;
            } catch (Exception e11) {
                C33272c c33272c = C33272c.f67812a;
                C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(context), "Error while opening activity", e11);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap m69350b(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Pair pairM90091to = TuplesKt.m90091to(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
    
        if (r2 == r4) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0121, code lost:
    
        if (r2 == r4) goto L60;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m69331a(Context context, Uri uri, String str, ContinuationImpl continuationImpl) {
        C28452f c28452f;
        String type;
        Uri uri2;
        Context context2 = context;
        Uri uri3 = uri;
        if (continuationImpl instanceof C28452f) {
            c28452f = (C28452f) continuationImpl;
            int i11 = c28452f.f57972d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28452f.f57972d = i11 - Integer.MIN_VALUE;
            } else {
                c28452f = new C28452f(continuationImpl);
            }
        } else {
            c28452f = new C28452f(continuationImpl);
        }
        Object objM69332a = c28452f.f57971c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28452f.f57972d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM69332a);
            if (str == null) {
                String path = uri3.getPath();
                if (path == null || path.length() == 0) {
                    type = null;
                } else {
                    type = context2.getContentResolver().getType(uri3);
                    if (type == null) {
                        try {
                            type = URLConnection.guessContentTypeFromName(new File(uri3.getPath()).getName());
                        } catch (Exception unused) {
                        }
                    }
                }
            } else {
                type = str;
            }
            if (type != null && type.length() != 0 && !StringsKt.startsWith$default(type, "image", false, 2, (Object) null) && !StringsKt.endsWith$default(type, "/image", false, 2, (Object) null)) {
                if (!StringsKt.startsWith$default(uri3.toString(), "content://", false, 2, (Object) null) && !StringsKt.startsWith$default(uri3.toString(), "file://", false, 2, (Object) null)) {
                    Logger.DefaultImpls.w$default(C33272c.f67812a, AbstractC33294e.m71624a(context2), "Unknown uri scheme: " + uri3.getScheme(), null, 4, null);
                    return null;
                }
                c28452f.f57972d = 3;
                objM69332a = C41686h.m91049g(C41782z0.m91392b(), new C28449e(context2, uri3, null), c28452f);
            } else {
                c28452f.f57969a = context2;
                c28452f.f57970b = uri3;
                c28452f.f57972d = 1;
                objM69332a = m69332a(uri3, context2, c28452f);
                if (objM69332a != coroutine_suspended) {
                    uri2 = (Uri) objM69332a;
                    if (uri2 != null) {
                        return uri2;
                    }
                    c28452f.f57969a = null;
                    c28452f.f57970b = null;
                    c28452f.f57972d = 2;
                    objM69332a = C41686h.m91049g(C41782z0.m91392b(), new C28449e(context2, uri3, null), c28452f);
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            Uri uri4 = c28452f.f57970b;
            Context context3 = c28452f.f57969a;
            ResultKt.throwOnFailure(objM69332a);
            uri3 = uri4;
            context2 = context3;
            uri2 = (Uri) objM69332a;
            if (uri2 != null) {
                return uri2;
            }
            c28452f.f57969a = null;
            c28452f.f57970b = null;
            c28452f.f57972d = 2;
            objM69332a = C41686h.m91049g(C41782z0.m91392b(), new C28449e(context2, uri3, null), c28452f);
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM69332a);
                String str2 = (String) objM69332a;
                if (str2 != null) {
                    return Uri.fromFile(new File(str2));
                }
                return null;
            }
            ResultKt.throwOnFailure(objM69332a);
        }
        String str3 = (String) objM69332a;
        if (str3 != null) {
            return Uri.fromFile(new File(str3));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m69352b(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m69332a(Uri uri, Context context, ContinuationImpl continuationImpl) {
        C28455g c28455g;
        if (continuationImpl instanceof C28455g) {
            c28455g = (C28455g) continuationImpl;
            int i11 = c28455g.f57976b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28455g.f57976b = i11 - Integer.MIN_VALUE;
            } else {
                c28455g = new C28455g(continuationImpl);
            }
        } else {
            c28455g = new C28455g(continuationImpl);
        }
        Object objM91049g = c28455g.f57975a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28455g.f57976b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            if (StringsKt.startsWith$default(uri.toString(), "content://com.android.gallery3d.provider", false, 2, (Object) null)) {
                Uri uri2 = Uri.parse(StringsKt.replace$default(uri.toString(), "com.android.gallery3d", "com.google.android.gallery3d", false, 4, (Object) null));
                c28455g.f57976b = 1;
                objM91049g = C41686h.m91049g(C41782z0.m91392b(), new C28449e(context, uri2, null), c28455g);
                if (objM91049g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM91049g);
        String str = (String) objM91049g;
        if (str != null) {
            return Uri.fromFile(new File(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final void m69342a(FragmentActivity fragmentActivity) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", fragmentActivity.getPackageName());
            fragmentActivity.startActivity(intent);
        } else {
            Intent intent2 = new Intent();
            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.fromParts(TPDownloadProxyEnum.DLPARAM_PACKAGE, fragmentActivity.getPackageName(), null));
            fragmentActivity.startActivity(intent2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m69339a(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: a */
    public static final ColorStateList m69329a(TypedArray typedArray, Context context, int i11) {
        switch (typedArray.getType(i11)) {
            case 28:
            case 29:
            case 30:
            case 31:
                return ColorStateList.valueOf(typedArray.getColor(i11, 0));
            default:
                int resourceId = typedArray.getResourceId(i11, -1);
                if (resourceId != -1) {
                    return AppCompatResources.getColorStateList(context, resourceId);
                }
                return ColorStateList.valueOf(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m69346a(Configuration configuration) {
        return (configuration.uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: a */
    public static final int m69328a(Context context, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.data;
    }

    /* JADX INFO: renamed from: a */
    public static final Map m69338a(Map map, Object obj, String str) {
        if (str == null && !map.containsKey(obj)) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        if (str == null) {
            linkedHashMap.remove(obj);
            return linkedHashMap;
        }
        linkedHashMap.put(obj, str);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public static final FragmentActivity m69330a(Context context) {
        if (context instanceof FragmentActivity) {
            return (FragmentActivity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            Context baseContext = ((ContextThemeWrapper) context).getBaseContext();
            if (baseContext instanceof FragmentActivity) {
                return (FragmentActivity) baseContext;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final void m69341a(TextView textView, CharSequence charSequence) {
        if (charSequence != null && !StringsKt.isBlank(charSequence)) {
            textView.setText(charSequence);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            textView.setText((CharSequence) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m69340a(ViewGroup viewGroup, int... iArr) {
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition == null) {
            layoutTransition = new LayoutTransition();
        }
        for (int i11 : iArr) {
            layoutTransition.enableTransitionType(i11);
        }
        layoutTransition.setDuration(100L);
        viewGroup.setLayoutTransition(layoutTransition);
    }

    /* JADX INFO: renamed from: a */
    public static final ArrayList m69335a(List list, AbstractC29172p abstractC29172p) {
        List list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Document document = (Document) obj;
            if (abstractC29172p.mo69760k().f59152b && ((list2 = abstractC29172p.mo69760k().f59154d) == null || !list2.contains(document.getType().f59014a))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final void m69344a(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m69343a(Integer num, Integer num2, Integer num3, View... viewArr) {
        int length = viewArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            View view = viewArr[i11];
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                if (num != null) {
                    marginLayoutParams.setMarginStart(num.intValue());
                }
                if (num2 != null) {
                    marginLayoutParams.setMarginEnd(num2.intValue());
                }
                if (num3 != null) {
                    marginLayoutParams.topMargin = num3.intValue();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap m69336a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
