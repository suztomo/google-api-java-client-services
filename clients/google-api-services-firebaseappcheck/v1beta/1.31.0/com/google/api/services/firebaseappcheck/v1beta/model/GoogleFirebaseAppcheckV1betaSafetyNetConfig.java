/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.firebaseappcheck.v1beta.model;

/**
 * An app's SafetyNet configuration object. This configuration controls certain properties of the
 * App Check token returned by ExchangeSafetyNetToken, such as its ttl. Note that your registered
 * SHA-256 certificate fingerprints are used to validate tokens issued by SafetyNet; please register
 * them via the Firebase Console or programmatically via the [Firebase Management Service](https://f
 * irebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.androidApps.sha/create).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Check API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppcheckV1betaSafetyNetConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. The relative resource name of the SafetyNet configuration object, in the format: ```
   * projects/{project_number}/apps/{app_id}/safetyNetConfig ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Specifies the duration for which App Check tokens exchanged from SafetyNet tokens will be
   * valid. If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days,
   * inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String tokenTtl;

  /**
   * Required. The relative resource name of the SafetyNet configuration object, in the format: ```
   * projects/{project_number}/apps/{app_id}/safetyNetConfig ```
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The relative resource name of the SafetyNet configuration object, in the format: ```
   * projects/{project_number}/apps/{app_id}/safetyNetConfig ```
   * @param name name or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaSafetyNetConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies the duration for which App Check tokens exchanged from SafetyNet tokens will be
   * valid. If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days,
   * inclusive.
   * @return value or {@code null} for none
   */
  public String getTokenTtl() {
    return tokenTtl;
  }

  /**
   * Specifies the duration for which App Check tokens exchanged from SafetyNet tokens will be
   * valid. If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days,
   * inclusive.
   * @param tokenTtl tokenTtl or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaSafetyNetConfig setTokenTtl(String tokenTtl) {
    this.tokenTtl = tokenTtl;
    return this;
  }

  @Override
  public GoogleFirebaseAppcheckV1betaSafetyNetConfig set(String fieldName, Object value) {
    return (GoogleFirebaseAppcheckV1betaSafetyNetConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppcheckV1betaSafetyNetConfig clone() {
    return (GoogleFirebaseAppcheckV1betaSafetyNetConfig) super.clone();
  }

}