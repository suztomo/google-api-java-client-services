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

package com.google.api.services.alertcenter.v1beta1.model;

/**
 * An outage incident reported by Google for a Google Workspace (formerly G Suite) application.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Alert Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsOutage extends com.google.api.client.json.GenericJson {

  /**
   * Link to the outage event in Google Workspace Status Dashboard
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dashboardUri;

  /**
   * Timestamp by which the next update shall be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String nextUpdateTime;

  /**
   * List of products impacted by the outage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> products;

  /**
   * Timestamp of the outage expected or confirmed resolution. (Used only when known).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String resolutionTime;

  /**
   * Current outage status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Link to the outage event in Google Workspace Status Dashboard
   * @return value or {@code null} for none
   */
  public java.lang.String getDashboardUri() {
    return dashboardUri;
  }

  /**
   * Link to the outage event in Google Workspace Status Dashboard
   * @param dashboardUri dashboardUri or {@code null} for none
   */
  public AppsOutage setDashboardUri(java.lang.String dashboardUri) {
    this.dashboardUri = dashboardUri;
    return this;
  }

  /**
   * Timestamp by which the next update shall be provided.
   * @return value or {@code null} for none
   */
  public String getNextUpdateTime() {
    return nextUpdateTime;
  }

  /**
   * Timestamp by which the next update shall be provided.
   * @param nextUpdateTime nextUpdateTime or {@code null} for none
   */
  public AppsOutage setNextUpdateTime(String nextUpdateTime) {
    this.nextUpdateTime = nextUpdateTime;
    return this;
  }

  /**
   * List of products impacted by the outage.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProducts() {
    return products;
  }

  /**
   * List of products impacted by the outage.
   * @param products products or {@code null} for none
   */
  public AppsOutage setProducts(java.util.List<java.lang.String> products) {
    this.products = products;
    return this;
  }

  /**
   * Timestamp of the outage expected or confirmed resolution. (Used only when known).
   * @return value or {@code null} for none
   */
  public String getResolutionTime() {
    return resolutionTime;
  }

  /**
   * Timestamp of the outage expected or confirmed resolution. (Used only when known).
   * @param resolutionTime resolutionTime or {@code null} for none
   */
  public AppsOutage setResolutionTime(String resolutionTime) {
    this.resolutionTime = resolutionTime;
    return this;
  }

  /**
   * Current outage status.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Current outage status.
   * @param status status or {@code null} for none
   */
  public AppsOutage setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public AppsOutage set(String fieldName, Object value) {
    return (AppsOutage) super.set(fieldName, value);
  }

  @Override
  public AppsOutage clone() {
    return (AppsOutage) super.clone();
  }

}