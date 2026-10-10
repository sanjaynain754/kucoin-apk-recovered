package p835zk;

import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.FragmentManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kucoin.utils.ThemeCacheUtil;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.theme.R$string;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: zk.c */
/* JADX INFO: compiled from: DayNightThemeDialogManager.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kucoin/dialog/DayNightThemeDialogManager;", "", "<init>", "()V", "IS_USEFOLLOWSYSTEM_MODE", "", "IS_NIGHT_NO_MODE", "IS_NIGHT_YES_MODE", "selectEdMode", "dayNightThemeSettingDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "setThemeFollowSystem", "", "setThemeMode", "mode", "", "dayNightThemeSetDialogShow", "manager", "Landroidx/fragment/app/FragmentManager;", "showDayNightThemeTipDialog", "", "showThemeTipDialog", "LTheme_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDayNightThemeDialogManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DayNightThemeDialogManager.kt\ncom/kubi/kucoin/dialog/DayNightThemeDialogManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1563#2:113\n1634#2,3:114\n*S KotlinDebug\n*F\n+ 1 DayNightThemeDialogManager.kt\ncom/kubi/kucoin/dialog/DayNightThemeDialogManager\n*L\n65#1:113\n65#1:114,3\n*E\n"})
public final class C46884c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46884c f104713a = new C46884c();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static String f104714b = "useFollowSystem";

    /* JADX INFO: renamed from: c */
    @Nullable
    public static DialogFragmentHelper f104715c;

    /* JADX INFO: renamed from: i */
    public static final void m103221i(DialogInterface dialogInterface, int i11) {
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        dayNightThemeManager.m33177b();
        ThemeCacheUtil.f28556a.m33123a();
        dayNightThemeManager.m33191p();
    }

    /* JADX INFO: renamed from: c */
    public final void m103222c(@NotNull FragmentManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Resources resources = BaseApplication.INSTANCE.get().getResources();
        ArrayList<BottomSheetDialogHelper.InterfaceC24339a> arrayList = new ArrayList();
        String string = resources.getString(R$string.daynighttheme_modetext_useFollowSystem);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        arrayList.add(new SelectEntity(null, string, "useFollowSystem", null, null, null, null, null, null, false, dayNightThemeManager.m33190o(), null, 3065, null));
        String string2 = resources.getString(R$string.daynighttheme_modetext_day);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new SelectEntity(null, string2, "useNightNo", null, null, null, null, null, null, false, !dayNightThemeManager.m33190o() && dayNightThemeManager.m33187l(), null, 3065, null));
        String string3 = resources.getString(R$string.daynighttheme_modetext_night);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        arrayList.add(new SelectEntity(null, string3, "useNightYes", null, null, null, null, null, null, false, (dayNightThemeManager.m33190o() || dayNightThemeManager.m33187l()) ? false : true, null, 3065, null));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a : arrayList) {
            if (interfaceC24339a.getIsChecked()) {
                f104714b = interfaceC24339a.getValue();
            }
            arrayList2.add(Unit.INSTANCE);
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: zk.a
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C46884c.m103220d((BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        f104715c = dialogFragmentHelperM58944B;
        if (dialogFragmentHelperM58944B != null) {
            dialogFragmentHelperM58944B.show(manager, "DayNightThemeSettingDialog");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m103223e() {
        DialogFragmentHelper dialogFragmentHelper = f104715c;
        if (dialogFragmentHelper != null) {
            dialogFragmentHelper.dismiss();
        }
        DayNightThemeManager.f28592a.m33194s();
    }

    /* JADX INFO: renamed from: f */
    public final void m103224f(int i11) {
        ThemeCacheUtil themeCacheUtil = ThemeCacheUtil.f28556a;
        themeCacheUtil.m33123a();
        themeCacheUtil.m33124b(false);
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        dayNightThemeManager.m33193r(i11);
        dayNightThemeManager.m33191p();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m103225g(@NotNull FragmentManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (!ThemeCacheUtil.f28556a.m33125c()) {
            return false;
        }
        m103226h(manager);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m103226h(FragmentManager fragmentManager) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54153J4(R$string.dialog_content_text_daynightthemechangetip).m54161R4(0).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: zk.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C46884c.m103221i(dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, null).m54172c5(fragmentManager);
    }

    /* JADX INFO: renamed from: d */
    public static final void m103220d(BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        if (!Intrinsics.areEqual(interfaceC24339a.getValue(), f104714b)) {
            f104714b = interfaceC24339a.getValue();
            String value = interfaceC24339a.getValue();
            int iHashCode = value.hashCode();
            if (iHashCode != 324314226) {
                if (iHashCode != 492525671) {
                    if (iHashCode == 1463816790 && value.equals("useNightYes")) {
                        f104713a.m103224f(2);
                        return;
                    }
                    return;
                }
                if (value.equals("useFollowSystem")) {
                    f104713a.m103223e();
                    return;
                }
                return;
            }
            if (!value.equals("useNightNo")) {
                return;
            }
            f104713a.m103224f(1);
        }
    }
}
