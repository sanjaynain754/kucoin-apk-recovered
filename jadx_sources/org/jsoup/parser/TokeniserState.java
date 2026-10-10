package org.jsoup.parser;

import okio.Utf8;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes61.dex */
enum TokeniserState {
    Data { // from class: org.jsoup.parser.TokeniserState.1
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95100s = c43295a.m95100s();
            if (cM95100s != 0) {
                if (cM95100s != '&') {
                    if (cM95100s != '<') {
                        if (cM95100s != 65535) {
                            c43302h.m95240k(c43295a.m95087f());
                            return;
                        } else {
                            c43302h.m95241l(new Token.C43224f());
                            return;
                        }
                    }
                    c43302h.m95230a(TokeniserState.TagOpen);
                    return;
                }
                c43302h.m95230a(TokeniserState.CharacterReferenceInData);
                return;
            }
            c43302h.m95248s(this);
            c43302h.m95239j(c43295a.m95086e());
        }
    },
    CharacterReferenceInData { // from class: org.jsoup.parser.TokeniserState.2
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            TokeniserState.m95066c(c43302h, TokeniserState.Data);
        }
    },
    Rcdata { // from class: org.jsoup.parser.TokeniserState.3
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95100s = c43295a.m95100s();
            if (cM95100s != 0) {
                if (cM95100s != '&') {
                    if (cM95100s != '<') {
                        if (cM95100s != 65535) {
                            c43302h.m95240k(c43295a.m95087f());
                            return;
                        } else {
                            c43302h.m95241l(new Token.C43224f());
                            return;
                        }
                    }
                    c43302h.m95230a(TokeniserState.RcdataLessthanSign);
                    return;
                }
                c43302h.m95230a(TokeniserState.CharacterReferenceInRcdata);
                return;
            }
            c43302h.m95248s(this);
            c43295a.m95083a();
            c43302h.m95239j(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    CharacterReferenceInRcdata { // from class: org.jsoup.parser.TokeniserState.4
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            TokeniserState.m95066c(c43302h, TokeniserState.Rcdata);
        }
    },
    Rawtext { // from class: org.jsoup.parser.TokeniserState.5
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            TokeniserState.m95068e(c43302h, c43295a, this, TokeniserState.RawtextLessthanSign);
        }
    },
    ScriptData { // from class: org.jsoup.parser.TokeniserState.6
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            TokeniserState.m95068e(c43302h, c43295a, this, TokeniserState.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT { // from class: org.jsoup.parser.TokeniserState.7
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95100s = c43295a.m95100s();
            if (cM95100s != 0) {
                if (cM95100s != 65535) {
                    c43302h.m95240k(c43295a.m95094m((char) 0));
                    return;
                } else {
                    c43302h.m95241l(new Token.C43224f());
                    return;
                }
            }
            c43302h.m95248s(this);
            c43295a.m95083a();
            c43302h.m95239j(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    TagOpen { // from class: org.jsoup.parser.TokeniserState.8
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95100s = c43295a.m95100s();
            if (cM95100s != '!') {
                if (cM95100s != '/') {
                    if (cM95100s != '?') {
                        if (c43295a.m95076E()) {
                            c43302h.m95237h(true);
                            c43302h.m95251v(TokeniserState.TagName);
                            return;
                        } else {
                            c43302h.m95248s(this);
                            c43302h.m95239j(Typography.less);
                            c43302h.m95251v(TokeniserState.Data);
                            return;
                        }
                    }
                    c43302h.m95234e();
                    c43302h.m95230a(TokeniserState.BogusComment);
                    return;
                }
                c43302h.m95230a(TokeniserState.EndTagOpen);
                return;
            }
            c43302h.m95230a(TokeniserState.MarkupDeclarationOpen);
        }
    },
    EndTagOpen { // from class: org.jsoup.parser.TokeniserState.9
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95101t()) {
                c43302h.m95246q(this);
                c43302h.m95240k("</");
                c43302h.m95251v(TokeniserState.Data);
            } else if (c43295a.m95076E()) {
                c43302h.m95237h(false);
                c43302h.m95251v(TokeniserState.TagName);
            } else if (c43295a.m95106y(Typography.greater)) {
                c43302h.m95248s(this);
                c43302h.m95230a(TokeniserState.Data);
            } else {
                c43302h.m95248s(this);
                c43302h.m95234e();
                c43302h.m95230a(TokeniserState.BogusComment);
            }
        }
    },
    TagName { // from class: org.jsoup.parser.TokeniserState.10
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            c43302h.f95520i.m95059v(c43295a.m95093l());
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != ' ') {
                    if (cM95086e != '/') {
                        if (cM95086e != '<') {
                            if (cM95086e != '>') {
                                if (cM95086e != 65535) {
                                    if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r') {
                                        c43302h.f95520i.m95058u(cM95086e);
                                        return;
                                    }
                                } else {
                                    c43302h.m95246q(this);
                                    c43302h.m95251v(TokeniserState.Data);
                                    return;
                                }
                            }
                        } else {
                            c43295a.m95081K();
                            c43302h.m95248s(this);
                        }
                        c43302h.m95245p();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    c43302h.m95251v(TokeniserState.SelfClosingStartTag);
                    return;
                }
                c43302h.m95251v(TokeniserState.BeforeAttributeName);
                return;
            }
            c43302h.f95520i.m95059v(TokeniserState.f95451b);
        }
    },
    RcdataLessthanSign { // from class: org.jsoup.parser.TokeniserState.11
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95106y('/')) {
                c43302h.m95238i();
                c43302h.m95230a(TokeniserState.RCDATAEndTagOpen);
                return;
            }
            if (c43295a.m95076E() && c43302h.m95231b() != null) {
                if (!c43295a.m95099r("</" + c43302h.m95231b())) {
                    c43302h.f95520i = c43302h.m95237h(false).m95049B(c43302h.m95231b());
                    c43302h.m95245p();
                    c43295a.m95081K();
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
            }
            c43302h.m95240k("<");
            c43302h.m95251v(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagOpen { // from class: org.jsoup.parser.TokeniserState.12
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95076E()) {
                c43302h.m95237h(false);
                c43302h.f95520i.m95058u(c43295a.m95100s());
                c43302h.f95519h.append(c43295a.m95100s());
                c43302h.m95230a(TokeniserState.RCDATAEndTagName);
                return;
            }
            c43302h.m95240k("</");
            c43302h.m95251v(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagName { // from class: org.jsoup.parser.TokeniserState.13
        /* JADX INFO: renamed from: f */
        public final void m95069f(C43302h c43302h, C43295a c43295a) {
            c43302h.m95240k("</" + c43302h.f95519h.toString());
            c43295a.m95081K();
            c43302h.m95251v(TokeniserState.Rcdata);
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95076E()) {
                String strM95090i = c43295a.m95090i();
                c43302h.f95520i.m95059v(strM95090i);
                c43302h.f95519h.append(strM95090i);
                return;
            }
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r' && cM95086e != ' ') {
                if (cM95086e != '/') {
                    if (cM95086e != '>') {
                        m95069f(c43302h, c43295a);
                        return;
                    } else if (c43302h.m95249t()) {
                        c43302h.m95245p();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    } else {
                        m95069f(c43302h, c43295a);
                        return;
                    }
                }
                if (c43302h.m95249t()) {
                    c43302h.m95251v(TokeniserState.SelfClosingStartTag);
                    return;
                } else {
                    m95069f(c43302h, c43295a);
                    return;
                }
            }
            if (c43302h.m95249t()) {
                c43302h.m95251v(TokeniserState.BeforeAttributeName);
            } else {
                m95069f(c43302h, c43295a);
            }
        }
    },
    RawtextLessthanSign { // from class: org.jsoup.parser.TokeniserState.14
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95106y('/')) {
                c43302h.m95238i();
                c43302h.m95230a(TokeniserState.RawtextEndTagOpen);
            } else {
                c43302h.m95239j(Typography.less);
                c43302h.m95251v(TokeniserState.Rawtext);
            }
        }
    },
    RawtextEndTagOpen { // from class: org.jsoup.parser.TokeniserState.15
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            TokeniserState.m95067d(c43302h, c43295a, TokeniserState.RawtextEndTagName, TokeniserState.Rawtext);
        }
    },
    RawtextEndTagName { // from class: org.jsoup.parser.TokeniserState.16
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            TokeniserState.m95065b(c43302h, c43295a, TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign { // from class: org.jsoup.parser.TokeniserState.17
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '!') {
                if (cM95086e != '/') {
                    if (cM95086e != 65535) {
                        c43302h.m95240k("<");
                        c43295a.m95081K();
                        c43302h.m95251v(TokeniserState.ScriptData);
                        return;
                    } else {
                        c43302h.m95240k("<");
                        c43302h.m95246q(this);
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                }
                c43302h.m95238i();
                c43302h.m95251v(TokeniserState.ScriptDataEndTagOpen);
                return;
            }
            c43302h.m95240k("<!");
            c43302h.m95251v(TokeniserState.ScriptDataEscapeStart);
        }
    },
    ScriptDataEndTagOpen { // from class: org.jsoup.parser.TokeniserState.18
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            TokeniserState.m95067d(c43302h, c43295a, TokeniserState.ScriptDataEndTagName, TokeniserState.ScriptData);
        }
    },
    ScriptDataEndTagName { // from class: org.jsoup.parser.TokeniserState.19
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            TokeniserState.m95065b(c43302h, c43295a, TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart { // from class: org.jsoup.parser.TokeniserState.20
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (!c43295a.m95106y('-')) {
                c43302h.m95251v(TokeniserState.ScriptData);
            } else {
                c43302h.m95239j('-');
                c43302h.m95230a(TokeniserState.ScriptDataEscapeStartDash);
            }
        }
    },
    ScriptDataEscapeStartDash { // from class: org.jsoup.parser.TokeniserState.21
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (!c43295a.m95106y('-')) {
                c43302h.m95251v(TokeniserState.ScriptData);
            } else {
                c43302h.m95239j('-');
                c43302h.m95230a(TokeniserState.ScriptDataEscapedDashDash);
            }
        }
    },
    ScriptDataEscaped { // from class: org.jsoup.parser.TokeniserState.22
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95101t()) {
                c43302h.m95246q(this);
                c43302h.m95251v(TokeniserState.Data);
                return;
            }
            char cM95100s = c43295a.m95100s();
            if (cM95100s != 0) {
                if (cM95100s != '-') {
                    if (cM95100s != '<') {
                        c43302h.m95240k(c43295a.m95096o('-', Typography.less, 0));
                        return;
                    } else {
                        c43302h.m95230a(TokeniserState.ScriptDataEscapedLessthanSign);
                        return;
                    }
                }
                c43302h.m95239j('-');
                c43302h.m95230a(TokeniserState.ScriptDataEscapedDash);
                return;
            }
            c43302h.m95248s(this);
            c43295a.m95083a();
            c43302h.m95239j(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    ScriptDataEscapedDash { // from class: org.jsoup.parser.TokeniserState.23
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95101t()) {
                c43302h.m95246q(this);
                c43302h.m95251v(TokeniserState.Data);
                return;
            }
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '-') {
                    if (cM95086e != '<') {
                        c43302h.m95239j(cM95086e);
                        c43302h.m95251v(TokeniserState.ScriptDataEscaped);
                        return;
                    } else {
                        c43302h.m95251v(TokeniserState.ScriptDataEscapedLessthanSign);
                        return;
                    }
                }
                c43302h.m95239j(cM95086e);
                c43302h.m95251v(TokeniserState.ScriptDataEscapedDashDash);
                return;
            }
            c43302h.m95248s(this);
            c43302h.m95239j(Utf8.REPLACEMENT_CHARACTER);
            c43302h.m95251v(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.24
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95101t()) {
                c43302h.m95246q(this);
                c43302h.m95251v(TokeniserState.Data);
                return;
            }
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '-') {
                    if (cM95086e != '<') {
                        if (cM95086e != '>') {
                            c43302h.m95239j(cM95086e);
                            c43302h.m95251v(TokeniserState.ScriptDataEscaped);
                            return;
                        } else {
                            c43302h.m95239j(cM95086e);
                            c43302h.m95251v(TokeniserState.ScriptData);
                            return;
                        }
                    }
                    c43302h.m95251v(TokeniserState.ScriptDataEscapedLessthanSign);
                    return;
                }
                c43302h.m95239j(cM95086e);
                return;
            }
            c43302h.m95248s(this);
            c43302h.m95239j(Utf8.REPLACEMENT_CHARACTER);
            c43302h.m95251v(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.25
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95076E()) {
                c43302h.m95238i();
                c43302h.f95519h.append(c43295a.m95100s());
                c43302h.m95240k("<" + c43295a.m95100s());
                c43302h.m95230a(TokeniserState.ScriptDataDoubleEscapeStart);
                return;
            }
            if (c43295a.m95106y('/')) {
                c43302h.m95238i();
                c43302h.m95230a(TokeniserState.ScriptDataEscapedEndTagOpen);
            } else {
                c43302h.m95239j(Typography.less);
                c43302h.m95251v(TokeniserState.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedEndTagOpen { // from class: org.jsoup.parser.TokeniserState.26
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95076E()) {
                c43302h.m95237h(false);
                c43302h.f95520i.m95058u(c43295a.m95100s());
                c43302h.f95519h.append(c43295a.m95100s());
                c43302h.m95230a(TokeniserState.ScriptDataEscapedEndTagName);
                return;
            }
            c43302h.m95240k("</");
            c43302h.m95251v(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName { // from class: org.jsoup.parser.TokeniserState.27
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            TokeniserState.m95065b(c43302h, c43295a, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart { // from class: org.jsoup.parser.TokeniserState.28
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            TokeniserState.m95064a(c43302h, c43295a, TokeniserState.ScriptDataDoubleEscaped, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped { // from class: org.jsoup.parser.TokeniserState.29
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95100s = c43295a.m95100s();
            if (cM95100s != 0) {
                if (cM95100s != '-') {
                    if (cM95100s != '<') {
                        if (cM95100s != 65535) {
                            c43302h.m95240k(c43295a.m95096o('-', Typography.less, 0));
                            return;
                        } else {
                            c43302h.m95246q(this);
                            c43302h.m95251v(TokeniserState.Data);
                            return;
                        }
                    }
                    c43302h.m95239j(cM95100s);
                    c43302h.m95230a(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    return;
                }
                c43302h.m95239j(cM95100s);
                c43302h.m95230a(TokeniserState.ScriptDataDoubleEscapedDash);
                return;
            }
            c43302h.m95248s(this);
            c43295a.m95083a();
            c43302h.m95239j(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    ScriptDataDoubleEscapedDash { // from class: org.jsoup.parser.TokeniserState.30
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '-') {
                    if (cM95086e != '<') {
                        if (cM95086e != 65535) {
                            c43302h.m95239j(cM95086e);
                            c43302h.m95251v(TokeniserState.ScriptDataDoubleEscaped);
                            return;
                        } else {
                            c43302h.m95246q(this);
                            c43302h.m95251v(TokeniserState.Data);
                            return;
                        }
                    }
                    c43302h.m95239j(cM95086e);
                    c43302h.m95251v(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    return;
                }
                c43302h.m95239j(cM95086e);
                c43302h.m95251v(TokeniserState.ScriptDataDoubleEscapedDashDash);
                return;
            }
            c43302h.m95248s(this);
            c43302h.m95239j(Utf8.REPLACEMENT_CHARACTER);
            c43302h.m95251v(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.31
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '-') {
                    if (cM95086e != '<') {
                        if (cM95086e != '>') {
                            if (cM95086e != 65535) {
                                c43302h.m95239j(cM95086e);
                                c43302h.m95251v(TokeniserState.ScriptDataDoubleEscaped);
                                return;
                            } else {
                                c43302h.m95246q(this);
                                c43302h.m95251v(TokeniserState.Data);
                                return;
                            }
                        }
                        c43302h.m95239j(cM95086e);
                        c43302h.m95251v(TokeniserState.ScriptData);
                        return;
                    }
                    c43302h.m95239j(cM95086e);
                    c43302h.m95251v(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    return;
                }
                c43302h.m95239j(cM95086e);
                return;
            }
            c43302h.m95248s(this);
            c43302h.m95239j(Utf8.REPLACEMENT_CHARACTER);
            c43302h.m95251v(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.32
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (!c43295a.m95106y('/')) {
                c43302h.m95251v(TokeniserState.ScriptDataDoubleEscaped);
                return;
            }
            c43302h.m95239j('/');
            c43302h.m95238i();
            c43302h.m95230a(TokeniserState.ScriptDataDoubleEscapeEnd);
        }
    },
    ScriptDataDoubleEscapeEnd { // from class: org.jsoup.parser.TokeniserState.33
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            TokeniserState.m95064a(c43302h, c43295a, TokeniserState.ScriptDataEscaped, TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName { // from class: org.jsoup.parser.TokeniserState.34
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != ' ') {
                    if (cM95086e != '\"' && cM95086e != '\'') {
                        if (cM95086e != '/') {
                            if (cM95086e != 65535) {
                                if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r') {
                                    switch (cM95086e) {
                                        case '<':
                                            c43295a.m95081K();
                                            c43302h.m95248s(this);
                                            break;
                                        case '=':
                                            break;
                                        case '>':
                                            break;
                                        default:
                                            c43302h.f95520i.m95050C();
                                            c43295a.m95081K();
                                            c43302h.m95251v(TokeniserState.AttributeName);
                                            return;
                                    }
                                    c43302h.m95245p();
                                    c43302h.m95251v(TokeniserState.Data);
                                    return;
                                }
                                return;
                            }
                            c43302h.m95246q(this);
                            c43302h.m95251v(TokeniserState.Data);
                            return;
                        }
                        c43302h.m95251v(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    c43302h.m95248s(this);
                    c43302h.f95520i.m95050C();
                    c43302h.f95520i.m95053p(cM95086e);
                    c43302h.m95251v(TokeniserState.AttributeName);
                    return;
                }
                return;
            }
            c43295a.m95081K();
            c43302h.m95248s(this);
            c43302h.f95520i.m95050C();
            c43302h.m95251v(TokeniserState.AttributeName);
        }
    },
    AttributeName { // from class: org.jsoup.parser.TokeniserState.35
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            c43302h.f95520i.m95054q(c43295a.m95097p(TokeniserState.attributeNameCharsSorted));
            char cM95086e = c43295a.m95086e();
            if (cM95086e == 0) {
                c43302h.m95248s(this);
                c43302h.f95520i.m95053p(Utf8.REPLACEMENT_CHARACTER);
                return;
            }
            if (cM95086e != ' ') {
                if (cM95086e != '\"' && cM95086e != '\'') {
                    if (cM95086e == '/') {
                        c43302h.m95251v(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (cM95086e == 65535) {
                        c43302h.m95246q(this);
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r') {
                        switch (cM95086e) {
                            case '<':
                                break;
                            case '=':
                                c43302h.m95251v(TokeniserState.BeforeAttributeValue);
                                break;
                            case '>':
                                c43302h.m95245p();
                                c43302h.m95251v(TokeniserState.Data);
                                break;
                            default:
                                c43302h.f95520i.m95053p(cM95086e);
                                break;
                        }
                        return;
                    }
                }
                c43302h.m95248s(this);
                c43302h.f95520i.m95053p(cM95086e);
                return;
            }
            c43302h.m95251v(TokeniserState.AfterAttributeName);
        }
    },
    AfterAttributeName { // from class: org.jsoup.parser.TokeniserState.36
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != ' ') {
                    if (cM95086e != '\"' && cM95086e != '\'') {
                        if (cM95086e != '/') {
                            if (cM95086e != 65535) {
                                if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r') {
                                    switch (cM95086e) {
                                        case '<':
                                            break;
                                        case '=':
                                            c43302h.m95251v(TokeniserState.BeforeAttributeValue);
                                            break;
                                        case '>':
                                            c43302h.m95245p();
                                            c43302h.m95251v(TokeniserState.Data);
                                            break;
                                        default:
                                            c43302h.f95520i.m95050C();
                                            c43295a.m95081K();
                                            c43302h.m95251v(TokeniserState.AttributeName);
                                            break;
                                    }
                                    return;
                                }
                                return;
                            }
                            c43302h.m95246q(this);
                            c43302h.m95251v(TokeniserState.Data);
                            return;
                        }
                        c43302h.m95251v(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    c43302h.m95248s(this);
                    c43302h.f95520i.m95050C();
                    c43302h.f95520i.m95053p(cM95086e);
                    c43302h.m95251v(TokeniserState.AttributeName);
                    return;
                }
                return;
            }
            c43302h.m95248s(this);
            c43302h.f95520i.m95053p(Utf8.REPLACEMENT_CHARACTER);
            c43302h.m95251v(TokeniserState.AttributeName);
        }
    },
    BeforeAttributeValue { // from class: org.jsoup.parser.TokeniserState.37
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != ' ') {
                    if (cM95086e != '\"') {
                        if (cM95086e != '`') {
                            if (cM95086e != 65535) {
                                if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r') {
                                    if (cM95086e != '&') {
                                        if (cM95086e != '\'') {
                                            switch (cM95086e) {
                                                case '<':
                                                case '=':
                                                    break;
                                                case '>':
                                                    c43302h.m95248s(this);
                                                    c43302h.m95245p();
                                                    c43302h.m95251v(TokeniserState.Data);
                                                    break;
                                                default:
                                                    c43295a.m95081K();
                                                    c43302h.m95251v(TokeniserState.AttributeValue_unquoted);
                                                    break;
                                            }
                                            return;
                                        }
                                        c43302h.m95251v(TokeniserState.AttributeValue_singleQuoted);
                                        return;
                                    }
                                    c43295a.m95081K();
                                    c43302h.m95251v(TokeniserState.AttributeValue_unquoted);
                                    return;
                                }
                                return;
                            }
                            c43302h.m95246q(this);
                            c43302h.m95245p();
                            c43302h.m95251v(TokeniserState.Data);
                            return;
                        }
                        c43302h.m95248s(this);
                        c43302h.f95520i.m95055r(cM95086e);
                        c43302h.m95251v(TokeniserState.AttributeValue_unquoted);
                        return;
                    }
                    c43302h.m95251v(TokeniserState.AttributeValue_doubleQuoted);
                    return;
                }
                return;
            }
            c43302h.m95248s(this);
            c43302h.f95520i.m95055r(Utf8.REPLACEMENT_CHARACTER);
            c43302h.m95251v(TokeniserState.AttributeValue_unquoted);
        }
    },
    AttributeValue_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.38
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            String strM95097p = c43295a.m95097p(TokeniserState.attributeDoubleValueCharsSorted);
            if (strM95097p.length() > 0) {
                c43302h.f95520i.m95056s(strM95097p);
            } else {
                c43302h.f95520i.m95052F();
            }
            char cM95086e = c43295a.m95086e();
            if (cM95086e == 0) {
                c43302h.m95248s(this);
                c43302h.f95520i.m95055r(Utf8.REPLACEMENT_CHARACTER);
                return;
            }
            if (cM95086e == '\"') {
                c43302h.m95251v(TokeniserState.AfterAttributeValue_quoted);
                return;
            }
            if (cM95086e != '&') {
                if (cM95086e != 65535) {
                    c43302h.f95520i.m95055r(cM95086e);
                    return;
                } else {
                    c43302h.m95246q(this);
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
            }
            int[] iArrM95233d = c43302h.m95233d('\"', true);
            if (iArrM95233d != null) {
                c43302h.f95520i.m95057t(iArrM95233d);
            } else {
                c43302h.f95520i.m95055r(Typography.amp);
            }
        }
    },
    AttributeValue_singleQuoted { // from class: org.jsoup.parser.TokeniserState.39
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            String strM95097p = c43295a.m95097p(TokeniserState.attributeSingleValueCharsSorted);
            if (strM95097p.length() > 0) {
                c43302h.f95520i.m95056s(strM95097p);
            } else {
                c43302h.f95520i.m95052F();
            }
            char cM95086e = c43295a.m95086e();
            if (cM95086e == 0) {
                c43302h.m95248s(this);
                c43302h.f95520i.m95055r(Utf8.REPLACEMENT_CHARACTER);
                return;
            }
            if (cM95086e == 65535) {
                c43302h.m95246q(this);
                c43302h.m95251v(TokeniserState.Data);
                return;
            }
            if (cM95086e != '&') {
                if (cM95086e != '\'') {
                    c43302h.f95520i.m95055r(cM95086e);
                    return;
                } else {
                    c43302h.m95251v(TokeniserState.AfterAttributeValue_quoted);
                    return;
                }
            }
            int[] iArrM95233d = c43302h.m95233d('\'', true);
            if (iArrM95233d != null) {
                c43302h.f95520i.m95057t(iArrM95233d);
            } else {
                c43302h.f95520i.m95055r(Typography.amp);
            }
        }
    },
    AttributeValue_unquoted { // from class: org.jsoup.parser.TokeniserState.40
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            String strM95097p = c43295a.m95097p(TokeniserState.attributeValueUnquoted);
            if (strM95097p.length() > 0) {
                c43302h.f95520i.m95056s(strM95097p);
            }
            char cM95086e = c43295a.m95086e();
            if (cM95086e == 0) {
                c43302h.m95248s(this);
                c43302h.f95520i.m95055r(Utf8.REPLACEMENT_CHARACTER);
                return;
            }
            if (cM95086e != ' ') {
                if (cM95086e != '\"' && cM95086e != '`') {
                    if (cM95086e == 65535) {
                        c43302h.m95246q(this);
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r') {
                        if (cM95086e == '&') {
                            int[] iArrM95233d = c43302h.m95233d(Character.valueOf(Typography.greater), true);
                            if (iArrM95233d != null) {
                                c43302h.f95520i.m95057t(iArrM95233d);
                                return;
                            } else {
                                c43302h.f95520i.m95055r(Typography.amp);
                                return;
                            }
                        }
                        if (cM95086e != '\'') {
                            switch (cM95086e) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c43302h.m95245p();
                                    c43302h.m95251v(TokeniserState.Data);
                                    break;
                                default:
                                    c43302h.f95520i.m95055r(cM95086e);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c43302h.m95248s(this);
                c43302h.f95520i.m95055r(cM95086e);
                return;
            }
            c43302h.m95251v(TokeniserState.BeforeAttributeName);
        }
    },
    AfterAttributeValue_quoted { // from class: org.jsoup.parser.TokeniserState.41
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r' && cM95086e != ' ') {
                if (cM95086e != '/') {
                    if (cM95086e != '>') {
                        if (cM95086e != 65535) {
                            c43295a.m95081K();
                            c43302h.m95248s(this);
                            c43302h.m95251v(TokeniserState.BeforeAttributeName);
                            return;
                        } else {
                            c43302h.m95246q(this);
                            c43302h.m95251v(TokeniserState.Data);
                            return;
                        }
                    }
                    c43302h.m95245p();
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
                c43302h.m95251v(TokeniserState.SelfClosingStartTag);
                return;
            }
            c43302h.m95251v(TokeniserState.BeforeAttributeName);
        }
    },
    SelfClosingStartTag { // from class: org.jsoup.parser.TokeniserState.42
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '>') {
                if (cM95086e != 65535) {
                    c43295a.m95081K();
                    c43302h.m95248s(this);
                    c43302h.m95251v(TokeniserState.BeforeAttributeName);
                    return;
                } else {
                    c43302h.m95246q(this);
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
            }
            c43302h.f95520i.f95449i = true;
            c43302h.m95245p();
            c43302h.m95251v(TokeniserState.Data);
        }
    },
    BogusComment { // from class: org.jsoup.parser.TokeniserState.43
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            c43295a.m95081K();
            c43302h.f95525n.m95038q(c43295a.m95094m(Typography.greater));
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '>' && cM95086e != 65535) {
                return;
            }
            c43302h.m95243n();
            c43302h.m95251v(TokeniserState.Data);
        }
    },
    MarkupDeclarationOpen { // from class: org.jsoup.parser.TokeniserState.44
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95104w("--")) {
                c43302h.m95235f();
                c43302h.m95251v(TokeniserState.CommentStart);
            } else {
                if (c43295a.m95105x("DOCTYPE")) {
                    c43302h.m95251v(TokeniserState.Doctype);
                    return;
                }
                if (c43295a.m95104w("[CDATA[")) {
                    c43302h.m95238i();
                    c43302h.m95251v(TokeniserState.CdataSection);
                } else {
                    c43302h.m95248s(this);
                    c43302h.m95234e();
                    c43302h.m95230a(TokeniserState.BogusComment);
                }
            }
        }
    },
    CommentStart { // from class: org.jsoup.parser.TokeniserState.45
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '-') {
                    if (cM95086e != '>') {
                        if (cM95086e != 65535) {
                            c43295a.m95081K();
                            c43302h.m95251v(TokeniserState.Comment);
                            return;
                        } else {
                            c43302h.m95246q(this);
                            c43302h.m95243n();
                            c43302h.m95251v(TokeniserState.Data);
                            return;
                        }
                    }
                    c43302h.m95248s(this);
                    c43302h.m95243n();
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
                c43302h.m95251v(TokeniserState.CommentStartDash);
                return;
            }
            c43302h.m95248s(this);
            c43302h.f95525n.m95037p(Utf8.REPLACEMENT_CHARACTER);
            c43302h.m95251v(TokeniserState.Comment);
        }
    },
    CommentStartDash { // from class: org.jsoup.parser.TokeniserState.46
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '-') {
                    if (cM95086e != '>') {
                        if (cM95086e != 65535) {
                            c43302h.f95525n.m95037p(cM95086e);
                            c43302h.m95251v(TokeniserState.Comment);
                            return;
                        } else {
                            c43302h.m95246q(this);
                            c43302h.m95243n();
                            c43302h.m95251v(TokeniserState.Data);
                            return;
                        }
                    }
                    c43302h.m95248s(this);
                    c43302h.m95243n();
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
                c43302h.m95251v(TokeniserState.CommentStartDash);
                return;
            }
            c43302h.m95248s(this);
            c43302h.f95525n.m95037p(Utf8.REPLACEMENT_CHARACTER);
            c43302h.m95251v(TokeniserState.Comment);
        }
    },
    Comment { // from class: org.jsoup.parser.TokeniserState.47
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95100s = c43295a.m95100s();
            if (cM95100s != 0) {
                if (cM95100s != '-') {
                    if (cM95100s != 65535) {
                        c43302h.f95525n.m95038q(c43295a.m95096o('-', 0));
                        return;
                    }
                    c43302h.m95246q(this);
                    c43302h.m95243n();
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
                c43302h.m95230a(TokeniserState.CommentEndDash);
                return;
            }
            c43302h.m95248s(this);
            c43295a.m95083a();
            c43302h.f95525n.m95037p(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    CommentEndDash { // from class: org.jsoup.parser.TokeniserState.48
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '-') {
                    if (cM95086e != 65535) {
                        c43302h.f95525n.m95037p('-').m95037p(cM95086e);
                        c43302h.m95251v(TokeniserState.Comment);
                        return;
                    } else {
                        c43302h.m95246q(this);
                        c43302h.m95243n();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                }
                c43302h.m95251v(TokeniserState.CommentEnd);
                return;
            }
            c43302h.m95248s(this);
            c43302h.f95525n.m95037p('-').m95037p(Utf8.REPLACEMENT_CHARACTER);
            c43302h.m95251v(TokeniserState.Comment);
        }
    },
    CommentEnd { // from class: org.jsoup.parser.TokeniserState.49
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '!') {
                    if (cM95086e != '-') {
                        if (cM95086e != '>') {
                            if (cM95086e != 65535) {
                                c43302h.m95248s(this);
                                c43302h.f95525n.m95038q("--").m95037p(cM95086e);
                                c43302h.m95251v(TokeniserState.Comment);
                                return;
                            } else {
                                c43302h.m95246q(this);
                                c43302h.m95243n();
                                c43302h.m95251v(TokeniserState.Data);
                                return;
                            }
                        }
                        c43302h.m95243n();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    c43302h.m95248s(this);
                    c43302h.f95525n.m95037p('-');
                    return;
                }
                c43302h.m95248s(this);
                c43302h.m95251v(TokeniserState.CommentEndBang);
                return;
            }
            c43302h.m95248s(this);
            c43302h.f95525n.m95038q("--").m95037p(Utf8.REPLACEMENT_CHARACTER);
            c43302h.m95251v(TokeniserState.Comment);
        }
    },
    CommentEndBang { // from class: org.jsoup.parser.TokeniserState.50
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '-') {
                    if (cM95086e != '>') {
                        if (cM95086e != 65535) {
                            c43302h.f95525n.m95038q("--!").m95037p(cM95086e);
                            c43302h.m95251v(TokeniserState.Comment);
                            return;
                        } else {
                            c43302h.m95246q(this);
                            c43302h.m95243n();
                            c43302h.m95251v(TokeniserState.Data);
                            return;
                        }
                    }
                    c43302h.m95243n();
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
                c43302h.f95525n.m95038q("--!");
                c43302h.m95251v(TokeniserState.CommentEndDash);
                return;
            }
            c43302h.m95248s(this);
            c43302h.f95525n.m95038q("--!").m95037p(Utf8.REPLACEMENT_CHARACTER);
            c43302h.m95251v(TokeniserState.Comment);
        }
    },
    Doctype { // from class: org.jsoup.parser.TokeniserState.51
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r' && cM95086e != ' ') {
                if (cM95086e != '>') {
                    if (cM95086e != 65535) {
                        c43302h.m95248s(this);
                        c43302h.m95251v(TokeniserState.BeforeDoctypeName);
                        return;
                    }
                    c43302h.m95246q(this);
                }
                c43302h.m95248s(this);
                c43302h.m95236g();
                c43302h.f95524m.f95441f = true;
                c43302h.m95244o();
                c43302h.m95251v(TokeniserState.Data);
                return;
            }
            c43302h.m95251v(TokeniserState.BeforeDoctypeName);
        }
    },
    BeforeDoctypeName { // from class: org.jsoup.parser.TokeniserState.52
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95076E()) {
                c43302h.m95236g();
                c43302h.m95251v(TokeniserState.DoctypeName);
                return;
            }
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != ' ') {
                    if (cM95086e != 65535) {
                        if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r') {
                            c43302h.m95236g();
                            c43302h.f95524m.f95437b.append(cM95086e);
                            c43302h.m95251v(TokeniserState.DoctypeName);
                            return;
                        }
                        return;
                    }
                    c43302h.m95246q(this);
                    c43302h.m95236g();
                    c43302h.f95524m.f95441f = true;
                    c43302h.m95244o();
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
                return;
            }
            c43302h.m95248s(this);
            c43302h.m95236g();
            c43302h.f95524m.f95437b.append(Utf8.REPLACEMENT_CHARACTER);
            c43302h.m95251v(TokeniserState.DoctypeName);
        }
    },
    DoctypeName { // from class: org.jsoup.parser.TokeniserState.53
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95076E()) {
                c43302h.f95524m.f95437b.append(c43295a.m95090i());
                return;
            }
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != ' ') {
                    if (cM95086e != '>') {
                        if (cM95086e != 65535) {
                            if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r') {
                                c43302h.f95524m.f95437b.append(cM95086e);
                                return;
                            }
                        } else {
                            c43302h.m95246q(this);
                            c43302h.f95524m.f95441f = true;
                            c43302h.m95244o();
                            c43302h.m95251v(TokeniserState.Data);
                            return;
                        }
                    } else {
                        c43302h.m95244o();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                }
                c43302h.m95251v(TokeniserState.AfterDoctypeName);
                return;
            }
            c43302h.m95248s(this);
            c43302h.f95524m.f95437b.append(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    AfterDoctypeName { // from class: org.jsoup.parser.TokeniserState.54
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            if (c43295a.m95101t()) {
                c43302h.m95246q(this);
                c43302h.f95524m.f95441f = true;
                c43302h.m95244o();
                c43302h.m95251v(TokeniserState.Data);
                return;
            }
            if (c43295a.m95072A('\t', '\n', '\r', '\f', ' ')) {
                c43295a.m95083a();
                return;
            }
            if (c43295a.m95106y(Typography.greater)) {
                c43302h.m95244o();
                c43302h.m95230a(TokeniserState.Data);
                return;
            }
            if (c43295a.m95105x("PUBLIC")) {
                c43302h.f95524m.f95438c = "PUBLIC";
                c43302h.m95251v(TokeniserState.AfterDoctypePublicKeyword);
            } else if (c43295a.m95105x("SYSTEM")) {
                c43302h.f95524m.f95438c = "SYSTEM";
                c43302h.m95251v(TokeniserState.AfterDoctypeSystemKeyword);
            } else {
                c43302h.m95248s(this);
                c43302h.f95524m.f95441f = true;
                c43302h.m95230a(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword { // from class: org.jsoup.parser.TokeniserState.55
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r' && cM95086e != ' ') {
                if (cM95086e != '\"') {
                    if (cM95086e != '\'') {
                        if (cM95086e != '>') {
                            if (cM95086e != 65535) {
                                c43302h.m95248s(this);
                                c43302h.f95524m.f95441f = true;
                                c43302h.m95251v(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                c43302h.m95246q(this);
                                c43302h.f95524m.f95441f = true;
                                c43302h.m95244o();
                                c43302h.m95251v(TokeniserState.Data);
                                return;
                            }
                        }
                        c43302h.m95248s(this);
                        c43302h.f95524m.f95441f = true;
                        c43302h.m95244o();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    c43302h.m95248s(this);
                    c43302h.m95251v(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                    return;
                }
                c43302h.m95248s(this);
                c43302h.m95251v(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            c43302h.m95251v(TokeniserState.BeforeDoctypePublicIdentifier);
        }
    },
    BeforeDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.56
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r' && cM95086e != ' ') {
                if (cM95086e != '\"') {
                    if (cM95086e != '\'') {
                        if (cM95086e != '>') {
                            if (cM95086e != 65535) {
                                c43302h.m95248s(this);
                                c43302h.f95524m.f95441f = true;
                                c43302h.m95251v(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                c43302h.m95246q(this);
                                c43302h.f95524m.f95441f = true;
                                c43302h.m95244o();
                                c43302h.m95251v(TokeniserState.Data);
                                return;
                            }
                        }
                        c43302h.m95248s(this);
                        c43302h.f95524m.f95441f = true;
                        c43302h.m95244o();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    c43302h.m95251v(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                    return;
                }
                c43302h.m95251v(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.57
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '\"') {
                    if (cM95086e != '>') {
                        if (cM95086e != 65535) {
                            c43302h.f95524m.f95439d.append(cM95086e);
                            return;
                        }
                        c43302h.m95246q(this);
                        c43302h.f95524m.f95441f = true;
                        c43302h.m95244o();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    c43302h.m95248s(this);
                    c43302h.f95524m.f95441f = true;
                    c43302h.m95244o();
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
                c43302h.m95251v(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            c43302h.m95248s(this);
            c43302h.f95524m.f95439d.append(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    DoctypePublicIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.58
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '\'') {
                    if (cM95086e != '>') {
                        if (cM95086e != 65535) {
                            c43302h.f95524m.f95439d.append(cM95086e);
                            return;
                        }
                        c43302h.m95246q(this);
                        c43302h.f95524m.f95441f = true;
                        c43302h.m95244o();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    c43302h.m95248s(this);
                    c43302h.f95524m.f95441f = true;
                    c43302h.m95244o();
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
                c43302h.m95251v(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            c43302h.m95248s(this);
            c43302h.f95524m.f95439d.append(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    AfterDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.59
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r' && cM95086e != ' ') {
                if (cM95086e != '\"') {
                    if (cM95086e != '\'') {
                        if (cM95086e != '>') {
                            if (cM95086e != 65535) {
                                c43302h.m95248s(this);
                                c43302h.f95524m.f95441f = true;
                                c43302h.m95251v(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                c43302h.m95246q(this);
                                c43302h.f95524m.f95441f = true;
                                c43302h.m95244o();
                                c43302h.m95251v(TokeniserState.Data);
                                return;
                            }
                        }
                        c43302h.m95244o();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    c43302h.m95248s(this);
                    c43302h.m95251v(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                c43302h.m95248s(this);
                c43302h.m95251v(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            c43302h.m95251v(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers { // from class: org.jsoup.parser.TokeniserState.60
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r' && cM95086e != ' ') {
                if (cM95086e != '\"') {
                    if (cM95086e != '\'') {
                        if (cM95086e != '>') {
                            if (cM95086e != 65535) {
                                c43302h.m95248s(this);
                                c43302h.f95524m.f95441f = true;
                                c43302h.m95251v(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                c43302h.m95246q(this);
                                c43302h.f95524m.f95441f = true;
                                c43302h.m95244o();
                                c43302h.m95251v(TokeniserState.Data);
                                return;
                            }
                        }
                        c43302h.m95244o();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    c43302h.m95248s(this);
                    c43302h.m95251v(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                c43302h.m95248s(this);
                c43302h.m95251v(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
            }
        }
    },
    AfterDoctypeSystemKeyword { // from class: org.jsoup.parser.TokeniserState.61
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r' && cM95086e != ' ') {
                if (cM95086e != '\"') {
                    if (cM95086e != '\'') {
                        if (cM95086e != '>') {
                            if (cM95086e != 65535) {
                                c43302h.m95248s(this);
                                c43302h.f95524m.f95441f = true;
                                c43302h.m95244o();
                                return;
                            } else {
                                c43302h.m95246q(this);
                                c43302h.f95524m.f95441f = true;
                                c43302h.m95244o();
                                c43302h.m95251v(TokeniserState.Data);
                                return;
                            }
                        }
                        c43302h.m95248s(this);
                        c43302h.f95524m.f95441f = true;
                        c43302h.m95244o();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    c43302h.m95248s(this);
                    c43302h.m95251v(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                c43302h.m95248s(this);
                c43302h.m95251v(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            c43302h.m95251v(TokeniserState.BeforeDoctypeSystemIdentifier);
        }
    },
    BeforeDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.62
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r' && cM95086e != ' ') {
                if (cM95086e != '\"') {
                    if (cM95086e != '\'') {
                        if (cM95086e != '>') {
                            if (cM95086e != 65535) {
                                c43302h.m95248s(this);
                                c43302h.f95524m.f95441f = true;
                                c43302h.m95251v(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                c43302h.m95246q(this);
                                c43302h.f95524m.f95441f = true;
                                c43302h.m95244o();
                                c43302h.m95251v(TokeniserState.Data);
                                return;
                            }
                        }
                        c43302h.m95248s(this);
                        c43302h.f95524m.f95441f = true;
                        c43302h.m95244o();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    c43302h.m95251v(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                c43302h.m95251v(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.63
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '\"') {
                    if (cM95086e != '>') {
                        if (cM95086e != 65535) {
                            c43302h.f95524m.f95440e.append(cM95086e);
                            return;
                        }
                        c43302h.m95246q(this);
                        c43302h.f95524m.f95441f = true;
                        c43302h.m95244o();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    c43302h.m95248s(this);
                    c43302h.f95524m.f95441f = true;
                    c43302h.m95244o();
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
                c43302h.m95251v(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            c43302h.m95248s(this);
            c43302h.f95524m.f95440e.append(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    DoctypeSystemIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.64
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != 0) {
                if (cM95086e != '\'') {
                    if (cM95086e != '>') {
                        if (cM95086e != 65535) {
                            c43302h.f95524m.f95440e.append(cM95086e);
                            return;
                        }
                        c43302h.m95246q(this);
                        c43302h.f95524m.f95441f = true;
                        c43302h.m95244o();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                    c43302h.m95248s(this);
                    c43302h.f95524m.f95441f = true;
                    c43302h.m95244o();
                    c43302h.m95251v(TokeniserState.Data);
                    return;
                }
                c43302h.m95251v(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            c43302h.m95248s(this);
            c43302h.f95524m.f95440e.append(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    AfterDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.65
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r' && cM95086e != ' ') {
                if (cM95086e != '>') {
                    if (cM95086e != 65535) {
                        c43302h.m95248s(this);
                        c43302h.m95251v(TokeniserState.BogusDoctype);
                        return;
                    } else {
                        c43302h.m95246q(this);
                        c43302h.f95524m.f95441f = true;
                        c43302h.m95244o();
                        c43302h.m95251v(TokeniserState.Data);
                        return;
                    }
                }
                c43302h.m95244o();
                c43302h.m95251v(TokeniserState.Data);
            }
        }
    },
    BogusDoctype { // from class: org.jsoup.parser.TokeniserState.66
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '>') {
                if (cM95086e != 65535) {
                    return;
                }
                c43302h.m95244o();
                c43302h.m95251v(TokeniserState.Data);
                return;
            }
            c43302h.m95244o();
            c43302h.m95251v(TokeniserState.Data);
        }
    },
    CdataSection { // from class: org.jsoup.parser.TokeniserState.67
        @Override // org.jsoup.parser.TokeniserState
        public void read(C43302h c43302h, C43295a c43295a) {
            c43302h.f95519h.append(c43295a.m95095n("]]>"));
            if (c43295a.m95104w("]]>") || c43295a.m95101t()) {
                c43302h.m95241l(new Token.C43220b(c43302h.f95519h.toString()));
                c43302h.m95251v(TokeniserState.Data);
            }
        }
    };

    static final char nullChar = 0;
    static final char[] attributeSingleValueCharsSorted = {0, Typography.amp, '\''};
    static final char[] attributeDoubleValueCharsSorted = {0, '\"', Typography.amp};
    static final char[] attributeNameCharsSorted = {0, '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', Typography.less, '=', Typography.greater};
    static final char[] attributeValueUnquoted = {0, '\t', '\n', '\f', '\r', ' ', '\"', Typography.amp, '\'', Typography.less, '=', Typography.greater, '`'};

    /* JADX INFO: renamed from: b */
    public static final String f95451b = String.valueOf(Utf8.REPLACEMENT_CHARACTER);

    /* JADX INFO: renamed from: c */
    public static void m95066c(C43302h c43302h, TokeniserState tokeniserState) {
        int[] iArrM95233d = c43302h.m95233d(null, false);
        if (iArrM95233d == null) {
            c43302h.m95239j(Typography.amp);
        } else {
            c43302h.m95242m(iArrM95233d);
        }
        c43302h.m95251v(tokeniserState);
    }

    public abstract void read(C43302h c43302h, C43295a c43295a);

    /* JADX INFO: renamed from: a */
    public static void m95064a(C43302h c43302h, C43295a c43295a, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (c43295a.m95076E()) {
            String strM95090i = c43295a.m95090i();
            c43302h.f95519h.append(strM95090i);
            c43302h.m95240k(strM95090i);
            return;
        }
        char cM95086e = c43295a.m95086e();
        if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r' && cM95086e != ' ' && cM95086e != '/' && cM95086e != '>') {
            c43295a.m95081K();
            c43302h.m95251v(tokeniserState2);
        } else {
            if (c43302h.f95519h.toString().equals("script")) {
                c43302h.m95251v(tokeniserState);
            } else {
                c43302h.m95251v(tokeniserState2);
            }
            c43302h.m95239j(cM95086e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m95065b(C43302h c43302h, C43295a c43295a, TokeniserState tokeniserState) {
        if (c43295a.m95076E()) {
            String strM95090i = c43295a.m95090i();
            c43302h.f95520i.m95059v(strM95090i);
            c43302h.f95519h.append(strM95090i);
            return;
        }
        if (c43302h.m95249t() && !c43295a.m95101t()) {
            char cM95086e = c43295a.m95086e();
            if (cM95086e != '\t' && cM95086e != '\n' && cM95086e != '\f' && cM95086e != '\r' && cM95086e != ' ') {
                if (cM95086e != '/') {
                    if (cM95086e != '>') {
                        c43302h.f95519h.append(cM95086e);
                    } else {
                        c43302h.m95245p();
                        c43302h.m95251v(Data);
                        return;
                    }
                } else {
                    c43302h.m95251v(SelfClosingStartTag);
                    return;
                }
            } else {
                c43302h.m95251v(BeforeAttributeName);
                return;
            }
        }
        c43302h.m95240k("</" + c43302h.f95519h.toString());
        c43302h.m95251v(tokeniserState);
    }

    /* JADX INFO: renamed from: d */
    public static void m95067d(C43302h c43302h, C43295a c43295a, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (c43295a.m95076E()) {
            c43302h.m95237h(false);
            c43302h.m95251v(tokeniserState);
        } else {
            c43302h.m95240k("</");
            c43302h.m95251v(tokeniserState2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m95068e(C43302h c43302h, C43295a c43295a, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char cM95100s = c43295a.m95100s();
        if (cM95100s != 0) {
            if (cM95100s != '<') {
                if (cM95100s != 65535) {
                    c43302h.m95240k(c43295a.m95092k());
                    return;
                } else {
                    c43302h.m95241l(new Token.C43224f());
                    return;
                }
            }
            c43302h.m95230a(tokeniserState2);
            return;
        }
        c43302h.m95248s(tokeniserState);
        c43295a.m95083a();
        c43302h.m95239j(Utf8.REPLACEMENT_CHARACTER);
    }
}
