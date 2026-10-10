package com.sumsub.sns.internal.core.common;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33978va;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28449e extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57962a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f57963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f57964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28449e(Context context, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f57963b = context;
        this.f57964c = uri;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28449e c28449e = new C28449e(this.f57963b, this.f57964c, continuation);
        c28449e.f57962a = obj;
        return c28449e;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28449e) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Cursor cursorQuery;
        int columnIndex;
        boolean zMoveToFirst;
        String string;
        String strSubstring;
        ContentResolver contentResolver;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f57962a;
        Context context = this.f57963b;
        if (context != null && (contentResolver = context.getContentResolver()) != null) {
            cursorQuery = contentResolver.query(this.f57964c, null, null, null, null);
        } else {
            cursorQuery = null;
        }
        if (cursorQuery != null) {
            columnIndex = cursorQuery.getColumnIndex("_display_name");
        } else {
            columnIndex = -1;
        }
        if (cursorQuery != null) {
            zMoveToFirst = cursorQuery.moveToFirst();
        } else {
            zMoveToFirst = false;
        }
        if (columnIndex != -1 && zMoveToFirst) {
            if (cursorQuery != null) {
                string = cursorQuery.getString(columnIndex);
            } else {
                string = null;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (string != null && string.length() != 0) {
                Integer numBoxInt = Boxing.boxInt(StringsKt.lastIndexOf$default((CharSequence) string, C33978va.f72339h, 0, false, 6, (Object) null));
                if (numBoxInt.intValue() <= -1) {
                    numBoxInt = null;
                }
                if (numBoxInt != null && (strSubstring = string.substring(numBoxInt.intValue())) != null) {
                    if (StringsKt.contains$default((CharSequence) strSubstring, '/', false, 2, (Object) null)) {
                        strSubstring = null;
                    }
                    if (strSubstring == null) {
                        strSubstring = "";
                    }
                } else {
                    strSubstring = "";
                }
                try {
                    File fileCreateTempFile = File.createTempFile("from_gallery", strSubstring, this.f57963b.getCacheDir());
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    InputStream inputStreamOpenInputStream = this.f57963b.getContentResolver().openInputStream(this.f57964c);
                    if (inputStreamOpenInputStream == null) {
                        return null;
                    }
                    boolean zM69293a = AbstractC28405L0.m69293a(inputStreamOpenInputStream, fileOutputStream);
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (RuntimeException e11) {
                        throw e11;
                    } catch (Exception unused) {
                    }
                    String path = fileCreateTempFile.getPath();
                    if (!zM69293a) {
                        return null;
                    }
                    return path;
                } catch (Exception e12) {
                    Logger.DefaultImpls.e$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m0), "Error copying content: " + e12, null, 4, null);
                }
            }
            return null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }
}
