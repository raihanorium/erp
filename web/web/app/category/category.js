'use strict';

angular.module('myApp.category', ['ngRoute', 'ngResource'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/category', {
            templateUrl: 'category/category.html',
            controller: 'CategoryCtrl'
        });
    }])

    .controller('CategoryCtrl', ['$scope', 'CategoryService', function ($scope, CategoryService) {
        $scope.lst = CategoryService.getAll();
        $scope.id = 11;
        $scope.single = CategoryService.get($scope.id);
    }])

    .factory('CategoryService', ['$resource', function ($resource) {
        var baseUrl = 'http://localhost:8080/rest/category';

        return {
            getAll: function () {
                return $resource(baseUrl).query();
            },
            get: function (id) {
                return $resource(baseUrl + '/:id').get({id: id});
            }
        };
    }]);