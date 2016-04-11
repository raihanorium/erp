'use strict';

angular.module('myApp.category', ['ngRoute', 'ngResource'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider
            .when('/category', {
                templateUrl: 'category/category.html',
                controller: 'CategoryCtrl'
            })
            .when('/category/:id', {
                templateUrl: 'category/category-detail.html',
                controller: 'CategoryDetailCtrl'
            })
        ;
    }])

    .controller('CategoryCtrl', ['$scope', 'CategoryService', function ($scope, CategoryService) {
        $scope.categories = CategoryService.getAll();
    }])

    .controller('CategoryDetailCtrl', ['$scope', '$routeParams', 'CategoryService', function ($scope, $routeParams, CategoryService) {
        $scope.single = CategoryService.get($routeParams.id);
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