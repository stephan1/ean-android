/*
 * Copyright (c) 2013, Expedia Affiliate Network
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that redistributions of source code
 * retain the above copyright notice, these conditions, and the following
 * disclaimer. 
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those
 * of the authors and should not be interpreted as representing official policies, 
 * either expressed or implied, of the Expedia Affiliate Network or Expedia Inc.
 */

package com.ean.mobile;

import java.util.Currency;
import java.util.Locale;

/**
 * Contains various constants for use in unit and integration tests.
 */
public final class TestConstants {

    public static final String CID = "55505";
    public static final String API_KEY = "cbrzfta369qwyrm9t5b8y8kf";
    public static final String SHARED_SECRET = "YOUR_SECRET";
    public static final String CUSTOMER_IP_ADDRESS = "127.0.0.1";
    public static final String CUSTOMER_USER_AGENT = "Android";
    public static final String CUSTOMER_SESSION_ID = "0ABAA856-83A7-F691-3C82-29AA53292D64";
    public static final Locale LOCALE = Locale.US;
    public static final Currency CURRENCY = Currency.getInstance(LOCALE);

    /**
     * Private, no-op constructor to prevent instantiation.
     */
    private TestConstants() {

    }
}