package p852kotlin.reflect;

import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExperimentalStdlibApi;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bc\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m90084d2 = {"Lkotlin/reflect/TypeImpl;", "Ljava/lang/reflect/Type;", "getTypeName", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@ExperimentalStdlibApi
interface TypeImpl extends Type {
    @NotNull
    String getTypeName();
}
