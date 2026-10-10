package com.sumsub.sns.internal.util.camera;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.p407io.FilesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.camera.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33394d {

    /* JADX INFO: renamed from: a */
    public final Context f68100a;

    /* JADX INFO: renamed from: b */
    public final C33398h f68101b;

    /* JADX INFO: renamed from: c */
    public final List f68102c = CollectionsKt.listOf((Object[]) new C33393c[]{new C33393c("virtualMp4", "virtual.mp4"), new C33393c("1000Bmp", "1000.bmp"), new C33393c("noToastJpg", "no_toast.jpg"), new C33393c("forceShowJpg", "force_show.jpg"), new C33393c("privateDirJpg", "private_dir.jpg"), new C33393c("disableJpg", "disable.jpg"), new C33393c("noSilentJpg", "no-silent.jpg")});

    /* JADX INFO: renamed from: a */
    public final List m71685a(XposedVirtualCameraDirectory xposedVirtualCameraDirectory) {
        File fileResolve;
        try {
            File directory = xposedVirtualCameraDirectory.getDirectory(this.f68100a);
            List<C33393c> list = this.f68102c;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (C33393c c33393c : list) {
                arrayList.add(new C33392b(c33393c.f68098a, xposedVirtualCameraDirectory, (directory == null || (fileResolve = FilesKt.resolve(directory, c33393c.f68099b)) == null) ? false : fileResolve.exists()));
            }
            return arrayList;
        } catch (Throwable unused) {
            return CollectionsKt.emptyList();
        }
    }

    public C33394d(Context context) {
        this.f68100a = context;
        this.f68101b = new C33398h(context);
    }
}
