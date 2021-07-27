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

package com.google.api.services.retail.v2beta.model;

/**
 * Resource that represents completion results.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaCompleteQueryResponseCompletionResult extends com.google.api.client.json.GenericJson {

  /**
   * Additional custom attributes ingested through BigQuery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudRetailV2betaCustomAttribute> attributes;

  /**
   * The suggestion for the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suggestion;

  /**
   * Additional custom attributes ingested through BigQuery.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudRetailV2betaCustomAttribute> getAttributes() {
    return attributes;
  }

  /**
   * Additional custom attributes ingested through BigQuery.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudRetailV2betaCompleteQueryResponseCompletionResult setAttributes(java.util.Map<String, GoogleCloudRetailV2betaCustomAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * The suggestion for the query.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuggestion() {
    return suggestion;
  }

  /**
   * The suggestion for the query.
   * @param suggestion suggestion or {@code null} for none
   */
  public GoogleCloudRetailV2betaCompleteQueryResponseCompletionResult setSuggestion(java.lang.String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaCompleteQueryResponseCompletionResult set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaCompleteQueryResponseCompletionResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaCompleteQueryResponseCompletionResult clone() {
    return (GoogleCloudRetailV2betaCompleteQueryResponseCompletionResult) super.clone();
  }

}