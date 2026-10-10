package com.kubi.home.shortcut.edit;

import com.kubi.home.shortcut.IMenuItem;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.home.shortcut.edit.q */
/* JADX INFO: compiled from: EditHomeMenuViewModel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"4\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"TAG", "", "kotlin.jvm.PlatformType", "value", "", "Lcom/kubi/home/shortcut/IMenuItem;", "normalUserMenu", "Lcom/kubi/home/shortcut/edit/EditHomeMenuViewModel;", "getNormalUserMenu", "(Lcom/kubi/home/shortcut/edit/EditHomeMenuViewModel;)Ljava/util/List;", "setNormalUserMenu", "(Lcom/kubi/home/shortcut/edit/EditHomeMenuViewModel;Ljava/util/List;)V", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEditHomeMenuViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditHomeMenuViewModel.kt\ncom/kubi/home/shortcut/edit/EditHomeMenuViewModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n774#2:172\n865#2,2:173\n*S KotlinDebug\n*F\n+ 1 EditHomeMenuViewModel.kt\ncom/kubi/home/shortcut/edit/EditHomeMenuViewModelKt\n*L\n45#1:172\n45#1:173,2\n*E\n"})
public final class C14886q {

    /* JADX INFO: renamed from: a */
    public static final String f26304a = EditHomeMenuViewModel.class.getSimpleName();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<IMenuItem> m30392a(@NotNull EditHomeMenuViewModel editHomeMenuViewModel) {
        Intrinsics.checkNotNullParameter(editHomeMenuViewModel, "<this>");
        List<IMenuItem> listM30384p = editHomeMenuViewModel.m30384p();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM30384p) {
            if (((IMenuItem) obj).getF42794b() == 1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
