package com.sumsub.sns.internal.features.data.repository.applicant;

import androidx.autofill.HintConstants;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.AbstractC28405L0;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.model.common.remote.C29212F;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29342d1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29349e0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29350e1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29373h0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29390j1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29398k1;
import com.sumsub.sns.internal.features.data.repository.applicant.data.C29924c;
import com.sumsub.sns.internal.features.data.repository.applicant.data.C29927f;
import com.sumsub.sns.internal.features.data.utils.AbstractC30066f;
import com.sumsub.sns.internal.features.data.utils.C30062b;
import com.sumsub.sns.internal.features.data.utils.InterfaceC30061a;
import com.sumsub.sns.internal.log.C33272c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.internal.Reflection;
import retrofit2.Response;
import tg0.C44971x;
import ug0.C45236a;
import xg0.AbstractC46162a;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29914J implements InterfaceC29918a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29915K f60051a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29919b f60052b;

    /* JADX INFO: renamed from: c */
    public final AbstractC46162a f60053c = AbstractC28400J.m69286a(C28468k0.f57988f);

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: a */
    public final Object m69951a(String str, InputStream inputStream, String str2, IdentitySide identitySide, Map map, C29070X c29070x, ContinuationImpl continuationImpl) {
        C29911G c29911g;
        C29390j1 c29390j1;
        if (continuationImpl instanceof C29911G) {
            c29911g = (C29911G) continuationImpl;
            int i11 = c29911g.f60044c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29911g.f60044c = i11 - Integer.MIN_VALUE;
            } else {
                c29911g = new C29911G(this, continuationImpl);
            }
        } else {
            c29911g = new C29911G(this, continuationImpl);
        }
        C29911G c29911g2 = c29911g;
        Object objM70001b = c29911g2.f60042a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29911g2.f60044c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70001b);
            MultipartBody.Part partM70092a = AbstractC30066f.m70092a(inputStream);
            RequestBody requestBodyM70093a = AbstractC30066f.m70093a(str, str2, identitySide);
            Logger.DefaultImpls.d$default(C33272c.f67812a, "ApplicantRemoteDataSource", "uploadFile: meta=" + requestBodyM70093a + ", file=" + partM70092a, null, 4, null);
            InterfaceC29919b interfaceC29919b = this.f60052b;
            String str3 = c29070x != null ? c29070x.f59014a : null;
            c29911g2.f60044c = 1;
            objM70001b = interfaceC29919b.m70001b(partM70092a, requestBodyM70093a, map, str3, c29911g2);
            if (objM70001b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70001b);
        }
        C29398k1 c29398k1 = (C29398k1) ((Response) objM70001b).body();
        if (c29398k1 == null || (c29390j1 = c29398k1.f59406a) == null) {
            return null;
        }
        String str4 = c29390j1.f59401c;
        String str5 = c29390j1.f59400b;
        IdentitySide identitySide2 = c29390j1.f59402d;
        List list = c29390j1.f59403e;
        Integer num = c29390j1.f59399a;
        return new C29307Y0(str4, str5, identitySide2, list, num != null ? num.toString() : null, c29390j1.f59404f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: b */
    public final Object m69960b(String str, File file, String str2, IdentitySide identitySide, Map map, C29070X c29070x, InterfaceC30061a interfaceC30061a, ContinuationImpl continuationImpl) {
        C29913I c29913i;
        C29307Y0 c29307y0;
        Long l11;
        if (continuationImpl instanceof C29913I) {
            c29913i = (C29913I) continuationImpl;
            int i11 = c29913i.f60050c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29913i.f60050c = i11 - Integer.MIN_VALUE;
            } else {
                c29913i = new C29913I(this, continuationImpl);
            }
        } else {
            c29913i = new C29913I(this, continuationImpl);
        }
        C29913I c29913i2 = c29913i;
        Object objM69999a = c29913i2.f60048a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29913i2.f60050c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM69999a);
            MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("content", file.getName(), new C30062b(file, interfaceC30061a));
            RequestBody requestBodyM70093a = AbstractC30066f.m70093a(str, str2, identitySide);
            Logger.DefaultImpls.d$default(C33272c.f67812a, "ApplicantDataSource", "uploadFileForAction: meta=" + requestBodyM70093a + ", file=" + file.getName(), null, 4, null);
            InterfaceC29919b interfaceC29919b = this.f60052b;
            String str3 = c29070x != null ? c29070x.f59014a : null;
            c29913i2.f60050c = 1;
            objM69999a = interfaceC29919b.m69999a(partCreateFormData, requestBodyM70093a, map, str3, c29913i2);
            if (objM69999a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM69999a);
        }
        Response response = (Response) objM69999a;
        C29350e1 c29350e1 = (C29350e1) response.body();
        if (c29350e1 != null) {
            C29342d1 c29342d1 = c29350e1.f59370a;
            c29307y0 = new C29307Y0(c29342d1 != null ? c29342d1.f59358b : null, c29342d1 != null ? c29342d1.f59359c : null, null, null, (c29342d1 == null || (l11 = c29342d1.f59357a) == null) ? null : l11.toString(), null);
        } else {
            c29307y0 = null;
        }
        String str4 = response.headers().get("X-Image-Id");
        if (str4 != null) {
            C29307Y0 c29307y1 = c29307y0 != null ? new C29307Y0(c29307y0.f59316a, c29307y0.f59317b, c29307y0.f59318c, c29307y0.f59319d, str4, c29307y0.f59321f) : null;
            if (c29307y1 != null) {
                return c29307y1;
            }
        }
        return c29307y0;
    }

    public C29914J(InterfaceC29915K interfaceC29915K, InterfaceC29919b interfaceC29919b) {
        this.f60051a = interfaceC29915K;
        this.f60052b = interfaceC29919b;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: a */
    public final Object m69950a(String str, File file, String str2, IdentitySide identitySide, Map map, C29070X c29070x, InterfaceC30061a interfaceC30061a, ContinuationImpl continuationImpl) {
        C29912H c29912h;
        C29390j1 c29390j1;
        if (continuationImpl instanceof C29912H) {
            c29912h = (C29912H) continuationImpl;
            int i11 = c29912h.f60047c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29912h.f60047c = i11 - Integer.MIN_VALUE;
            } else {
                c29912h = new C29912H(this, continuationImpl);
            }
        } else {
            c29912h = new C29912H(this, continuationImpl);
        }
        C29912H c29912h2 = c29912h;
        Object objM70001b = c29912h2.f60045a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29912h2.f60047c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70001b);
            MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("content", file.getName(), new C30062b(file, interfaceC30061a));
            RequestBody requestBodyM70093a = AbstractC30066f.m70093a(str, str2, identitySide);
            Logger.DefaultImpls.d$default(C33272c.f67812a, "ApplicantRemoteDataSource", "uploadFile: meta=" + requestBodyM70093a + ", file=" + file.getName(), null, 4, null);
            InterfaceC29919b interfaceC29919b = this.f60052b;
            String str3 = c29070x != null ? c29070x.f59014a : null;
            c29912h2.f60047c = 1;
            objM70001b = interfaceC29919b.m70001b(partCreateFormData, requestBodyM70093a, map, str3, c29912h2);
            if (objM70001b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70001b);
        }
        C29398k1 c29398k1 = (C29398k1) ((Response) objM70001b).body();
        if (c29398k1 == null || (c29390j1 = c29398k1.f59406a) == null) {
            return null;
        }
        String str4 = c29390j1.f59401c;
        String str5 = c29390j1.f59400b;
        IdentitySide identitySide2 = c29390j1.f59402d;
        List list = c29390j1.f59403e;
        Integer num = c29390j1.f59399a;
        return new C29307Y0(str4, str5, identitySide2, list, num != null ? num.toString() : null, c29390j1.f59404f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m69962b(ContinuationImpl continuationImpl) {
        C29910F c29910f;
        if (continuationImpl instanceof C29910F) {
            c29910f = (C29910F) continuationImpl;
            int i11 = c29910f.f60041c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29910f.f60041c = i11 - Integer.MIN_VALUE;
            } else {
                c29910f = new C29910F(this, continuationImpl);
            }
        } else {
            c29910f = new C29910F(this, continuationImpl);
        }
        Object objM69986b = c29910f.f60039a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29910f.f60041c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM69986b);
            InterfaceC29915K interfaceC29915K = this.f60051a;
            c29910f.f60041c = 1;
            objM69986b = interfaceC29915K.m69986b(c29910f);
            if (objM69986b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM69986b);
        }
        Integer num = ((C29227I) objM69986b).f59218a;
        return Boxing.boxBoolean(num != null && num.intValue() == 1);
    }

    /* JADX INFO: renamed from: b */
    public final Object m69961b(String str, String str2, C29944t c29944t) {
        Logger.DefaultImpls.d$default(C33272c.f67812a, "ApplicantDataSource", "Set phone for action " + str, null, 4, null);
        Object objM69987b = this.f60051a.m69987b(m69959a(str, MapsKt.mapOf(TuplesKt.m90091to(HintConstants.AUTOFILL_HINT_PHONE, str2))), c29944t);
        return objM69987b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM69987b : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m69949a(int i11, ContinuationImpl continuationImpl) throws IOException {
        C29906B c29906b;
        InputStream inputStreamByteStream;
        if (continuationImpl instanceof C29906B) {
            c29906b = (C29906B) continuationImpl;
            int i12 = c29906b.f60029c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c29906b.f60029c = i12 - Integer.MIN_VALUE;
            } else {
                c29906b = new C29906B(this, continuationImpl);
            }
        } else {
            c29906b = new C29906B(this, continuationImpl);
        }
        Object objM69998a = c29906b.f60027a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c29906b.f60029c;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objM69998a);
            InterfaceC29919b interfaceC29919b = this.f60052b;
            c29906b.f60029c = 1;
            objM69998a = interfaceC29919b.m69998a(i11, c29906b);
            if (objM69998a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM69998a);
        }
        Response response = (Response) objM69998a;
        if (response.isSuccessful()) {
            ResponseBody responseBody = (ResponseBody) response.body();
            if (responseBody != null && (inputStreamByteStream = responseBody.byteStream()) != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (AbstractC28405L0.m69293a(inputStreamByteStream, byteArrayOutputStream)) {
                    return byteArrayOutputStream.toByteArray();
                }
                throw new IOException("Error downloading file");
            }
            throw new IOException("Error getting byte stream");
        }
        throw new IOException("Error downloading file");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m69956a(String str, ContinuationImpl continuationImpl) {
        C29909E c29909e;
        if (continuationImpl instanceof C29909E) {
            c29909e = (C29909E) continuationImpl;
            int i11 = c29909e.f60038c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29909e.f60038c = i11 - Integer.MIN_VALUE;
            } else {
                c29909e = new C29909E(this, continuationImpl);
            }
        } else {
            c29909e = new C29909E(this, continuationImpl);
        }
        Object objM69988c = c29909e.f60036a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29909e.f60038c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM69988c);
            InterfaceC29915K interfaceC29915K = this.f60051a;
            c29909e.f60038c = 1;
            objM69988c = interfaceC29915K.m69988c(str, c29909e);
            if (objM69988c == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM69988c);
        }
        Integer num = ((C29227I) objM69988c).f59218a;
        return Boxing.boxBoolean(num != null && num.intValue() == 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m69958a(ContinuationImpl continuationImpl) {
        C29905A c29905a;
        if (continuationImpl instanceof C29905A) {
            c29905a = (C29905A) continuationImpl;
            int i11 = c29905a.f60026c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29905a.f60026c = i11 - Integer.MIN_VALUE;
            } else {
                c29905a = new C29905A(this, continuationImpl);
            }
        } else {
            c29905a = new C29905A(this, continuationImpl);
        }
        Object objM69996g = c29905a.f60024a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29905a.f60026c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM69996g);
            InterfaceC29915K interfaceC29915K = this.f60051a;
            c29905a.f60026c = 1;
            objM69996g = interfaceC29915K.m69996g(c29905a);
            if (objM69996g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM69996g);
        }
        List list = ((C29212F) objM69996g).f59203a;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: a */
    public final Object m69952a(String str, String str2, C29943s c29943s) {
        Logger.DefaultImpls.d$default(C33272c.f67812a, "ApplicantDataSource", "Set language " + str2 + " for applicant " + str, null, 4, null);
        Object objM69990c = this.f60051a.m69990c(m69959a(str, MapsKt.mapOf(TuplesKt.m90091to("lang", str2))), c29943s);
        return objM69990c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM69990c : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final Object m69953a(String str, String str2, C29944t c29944t) {
        Logger.DefaultImpls.d$default(C33272c.f67812a, "ApplicantDataSource", "Set phone for applicant " + str, null, 4, null);
        Object objM69990c = this.f60051a.m69990c(m69959a(str, MapsKt.mapOf(TuplesKt.m90091to(HintConstants.AUTOFILL_HINT_PHONE, str2))), c29944t);
        return objM69990c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM69990c : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final RequestBody m69959a(String str, Map map) {
        RequestBody.Companion companion = RequestBody.INSTANCE;
        AbstractC46162a abstractC46162a = this.f60053c;
        Map mapPlus = MapsKt.plus(MapsKt.mapOf(TuplesKt.m90091to("id", str)), map);
        AbstractC46494a serializersModule = abstractC46162a.getSerializersModule();
        return companion.create(abstractC46162a.mo99409b(new C41790a1(C45236a.m99969u(C44971x.m99436a(serializersModule, Reflection.getOrCreateKotlinClass(Object.class))), C45236a.m99969u(C44971x.m99436a(serializersModule, Reflection.getOrCreateKotlinClass(Object.class)))), mapPlus), MediaType.INSTANCE.parse("application/json; charset=utf-8"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m69957a(List list, ContinuationImpl continuationImpl) {
        C29907C c29907c;
        if (continuationImpl instanceof C29907C) {
            c29907c = (C29907C) continuationImpl;
            int i11 = c29907c.f60032c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29907c.f60032c = i11 - Integer.MIN_VALUE;
            } else {
                c29907c = new C29907C(this, continuationImpl);
            }
        } else {
            c29907c = new C29907C(this, continuationImpl);
        }
        Object objM69968a = c29907c.f60030a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29907c.f60032c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM69968a);
            C29924c c29924c = new C29924c(list);
            InterfaceC29915K interfaceC29915K = this.f60051a;
            c29907c.f60032c = 1;
            objM69968a = interfaceC29915K.m69968a(c29924c, c29907c);
            if (objM69968a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM69968a);
        }
        return ((C29927f) objM69968a).f60062a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m69955a(String str, List list, ContinuationImpl continuationImpl) {
        C29908D c29908d;
        if (continuationImpl instanceof C29908D) {
            c29908d = (C29908D) continuationImpl;
            int i11 = c29908d.f60035c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29908d.f60035c = i11 - Integer.MIN_VALUE;
            } else {
                c29908d = new C29908D(this, continuationImpl);
            }
        } else {
            c29908d = new C29908D(this, continuationImpl);
        }
        Object objM69973a = c29908d.f60033a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29908d.f60035c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM69973a);
            C29924c c29924c = new C29924c(list);
            InterfaceC29915K interfaceC29915K = this.f60051a;
            c29908d.f60035c = 1;
            objM69973a = interfaceC29915K.m69973a(str, c29924c, c29908d);
            if (objM69973a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM69973a);
        }
        return ((C29927f) objM69973a).f60062a;
    }

    /* JADX INFO: renamed from: a */
    public final Object m69954a(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, List list, SuspendLambda suspendLambda) {
        ArrayList arrayList2;
        if (list != null) {
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C29373h0((String) it.next()));
            }
        } else {
            arrayList2 = null;
        }
        return this.f60051a.m69967a(new C29349e0(str, str2, str3, arrayList, str4, str5, arrayList2), suspendLambda);
    }
}
