'use strict';

/* https://github.com/angular/protractor/blob/master/docs/toc.md */

describe('my app', function() {


  it('should automatically redirect to /dashboard when location hash/fragment is empty', function() {
    browser.get('index.html');
    expect(browser.getLocationAbsUrl()).toMatch("/dashboard");
  });


  describe('dashboard', function() {

    beforeEach(function() {
      browser.get('index.html#/dashboard');
    });


    it('should render dashboard when user navigates to /dashboard', function() {
      expect(element.all(by.css('[ng-view] p')).first().getText()).
        toMatch(/partial for dashboard/);
    });

  });


  describe('category', function() {

    beforeEach(function() {
      browser.get('index.html#/category');
    });


    it('should render category when user navigates to /category', function() {
      expect(element.all(by.css('[ng-view] p')).first().getText()).
        toMatch(/partial for category/);
    });

  });
});
